/*
 *   Copyright 2014 Florida Institute for Human and Machine Cognition (IHMC)
 *    
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *    
 *    http://www.apache.org/licenses/LICENSE-2.0
 *    
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *    
 *    Written by Jesper Smith with assistance from IHMC team members
 */

package us.ihmc.codecs;

import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;

import us.ihmc.codecs.generated.EUsageType;
import us.ihmc.codecs.generated.FilterModeEnum;
import us.ihmc.codecs.generated.YUVPicture;
import us.ihmc.codecs.h264.OpenH264Decoder;
import us.ihmc.codecs.h264.OpenH264Encoder;
import us.ihmc.codecs.yuv.JPEGDecoder;
import us.ihmc.codecs.yuv.YUVPictureConverter;

/**
 *
 * Created by jesper on 8/19/14.
 */
public class OpenH264EncoderExample
{
   public static void main(String[] args) throws IOException, InvocationTargetException, InterruptedException
   {
      new OpenH264EncoderExample();
   }

   private JFrame window;
   private JLabel image;
   private JSlider resolution;
   private JSlider bitrateSlider;

   private OpenH264Encoder encoder = new OpenH264Encoder();
   private OpenH264Decoder decoder = new OpenH264Decoder();

   private int width = 1920, height = 1080;
   private int bitrate = 5000000;
   
   private final JPEGDecoder jpegDecoder = new JPEGDecoder();
   private final YUVPictureConverter converter = new YUVPictureConverter();

   public OpenH264EncoderExample() throws IOException, InvocationTargetException, InterruptedException
   {
      
      encoder.initialize(width, height, 10.0, bitrate, EUsageType.CAMERA_VIDEO_REAL_TIME);
      SwingUtilities.invokeAndWait(new Runnable()
      {
         @Override
         public void run()
         {
            createUI();
         }
      });

      for (int i = 1; i < 1930; i += 1)
      {
         YUVPicture pic = jpegDecoder.readJPEG(new File("data/image_" + i + ".jpg"));

         checkResolution();
         checkBitrate();

         if (pic.getWidth() != width || pic.getHeight() != height)
         {
            pic.scale(width, height, FilterModeEnum.kFilterBilinear);
         }

         encoder.encodeFrame(pic);
         
         while(encoder.nextNAL())
         {
            ByteBuffer nal = encoder.getNAL();
            final YUVPicture img = decoder.decodeFrame(nal);
            if (img != null)
            {
               SwingUtilities.invokeLater(new Runnable()
               {
                  @Override
                  public void run()
                  {
                     image.setIcon(new ImageIcon(converter.toBufferedImage(img)));
                  }
               });
            }
         }
         pic.delete();
      }

      jpegDecoder.delete();
      encoder.delete();
      decoder.delete();
   }

   private void checkResolution()
   {
      int newResolution = resolution.getValue() * 2;
      if (newResolution != width)
      {
         width = newResolution;
         height = (((newResolution * 9) / 16) >> 1) << 1;

         encoder.setSize(width, height);
         image.setPreferredSize(new Dimension(width, height));

      }
   }

   private void checkBitrate()
   {
      int newBitrate = bitrateSlider.getValue();
      if (newBitrate != bitrate)
      {
         encoder.setBitRate(newBitrate);
         this.bitrate = newBitrate;
      }
   }

   public void createUI()
   {
      window = new JFrame();
      Container main = window.getContentPane();
      main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

      JPanel imagePanel = new JPanel();
      imagePanel.setPreferredSize(new Dimension(1920, 1080));
      image = new JLabel();
      image.setPreferredSize(new Dimension(1920, 1080));
      imagePanel.add(image);
      window.add(imagePanel);

      JPanel resolutionPanel = new JPanel();
      resolutionPanel.setLayout(new BoxLayout(resolutionPanel, BoxLayout.X_AXIS));
      resolutionPanel.add(new JLabel("Resolution: "));
      resolution = new JSlider(240, 960);
      resolution.setValue(width);
      resolutionPanel.add(resolution);
      main.add(resolutionPanel);

      JPanel bitratePanel = new JPanel();
      bitratePanel.setLayout(new BoxLayout(bitratePanel, BoxLayout.X_AXIS));
      bitratePanel.add(new JLabel("Bitrate: "));
      bitrateSlider = new JSlider(100, 10000000);
      bitrateSlider.setValue(bitrate);
      bitratePanel.add(bitrateSlider);
      main.add(bitratePanel);

      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.pack();
      window.setVisible(true);
   }

}
