/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public interface codec_apiConstants {
  public final static int MAX_TEMPORAL_LAYER_NUM = 4;
  public final static int MAX_SPATIAL_LAYER_NUM = 4;
  public final static int MAX_QUALITY_LAYER_NUM = 4;
  public final static int MAX_LAYER_NUM_OF_FRAME = 128;
  public final static int MAX_NAL_UNITS_IN_LAYER = 128;
  public final static int MAX_RTP_PAYLOAD_LEN = 1000;
  public final static int AVERAGE_RTP_PAYLOAD_LEN = 800;
  public final static int SAVED_NALUNIT_NUM_TMP = ((4*4) +1+4);
  public final static int MAX_SLICES_NUM_TMP = ((128-((4*4) +1+4))/3);
  public final static int AUTO_REF_PIC_COUNT = -1;
  public final static int WELS_LOG_QUIET = 0x00;
  public final static int WELS_LOG_ERROR = 1 << 0;
  public final static int WELS_LOG_WARNING = 1 << 1;
  public final static int WELS_LOG_INFO = 1 << 2;
  public final static int WELS_LOG_DEBUG = 1 << 3;
  public final static int WELS_LOG_DETAIL = 1 << 4;
  public final static int WELS_LOG_RESV = 1 << 5;
  public final static int WELS_LOG_LEVEL_COUNT = 6;
  public final static int WELS_LOG_DEFAULT = WELS_LOG_DEBUG;

  public final static int FRAME_NUM_PARAM_SET = (-1);
  public final static int FRAME_NUM_IDR = 0;
  public final static int ET_NONE = 0x00;
  public final static int ET_IP_SCALE = 0x01;
  public final static int ET_FMO = 0x02;
  public final static int ET_IR_R1 = 0x04;
  public final static int ET_IR_R2 = 0x08;
  public final static int ET_IR_R3 = 0x10;
  public final static int ET_FEC_HALF = 0x20;
  public final static int ET_FEC_FULL = 0x40;
  public final static int ET_RFS = 0x80;

  public final static int CIF_WIDTH = 352;
  public final static int CIF_HEIGHT = 288;
  public final static int QVGA_WIDTH = 320;
  public final static int QVGA_HEIGHT = 240;
  public final static int QCIF_WIDTH = 176;
  public final static int QCIF_HEIGHT = 144;
  public final static int SQCIF_WIDTH = 128;
  public final static int SQCIF_HEIGHT = 96;
}