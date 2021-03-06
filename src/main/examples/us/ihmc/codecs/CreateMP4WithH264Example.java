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

import java.io.File;
import java.io.IOException;

import us.ihmc.codecs.builder.H264Settings;
import us.ihmc.codecs.builder.MP4H264MovieBuilder;
import us.ihmc.codecs.builder.MovieBuilder;
import us.ihmc.codecs.generated.EProfileIdc;
import us.ihmc.codecs.generated.YUVPicture;
import us.ihmc.codecs.yuv.JPEGDecoder;

public class CreateMP4WithH264Example
{
   public static void main(String[] args) throws IOException
   {
      int width = 1280;
      int height = 720;
      int framerate = 30;
      
      H264Settings settings = new H264Settings();
      settings.setProfileIdc(EProfileIdc.PRO_HIGH);


      MovieBuilder builder = new MP4H264MovieBuilder(new File("testH264.mp4"), width, height, framerate, settings);

      JPEGDecoder decoder = new JPEGDecoder();
      System.out.println("Writing movie");

      for (int i = 1; i < 261; i += 1)
      {
         System.out.print(".");
         System.out.flush();
         if (i % 100 == 0)
         {
            System.out.println();
         }

         YUVPicture pic = decoder.readJPEG(new File("data/image_" + i + ".jpg"));
         builder.encodeFrame(pic);
         pic.delete();
      }
      System.out.println();

      decoder.delete();
      builder.close();
   }
}
