/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public enum VIDEO_BITSTREAM_TYPE {
  VIDEO_BITSTREAM_AVC(0),
  VIDEO_BITSTREAM_SVC(1),
  VIDEO_BITSTREAM_DEFAULT(VIDEO_BITSTREAM_SVC);

  public final int swigValue() {
    return swigValue;
  }

  public static VIDEO_BITSTREAM_TYPE swigToEnum(int swigValue) {
    VIDEO_BITSTREAM_TYPE[] swigValues = VIDEO_BITSTREAM_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (VIDEO_BITSTREAM_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + VIDEO_BITSTREAM_TYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private VIDEO_BITSTREAM_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private VIDEO_BITSTREAM_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private VIDEO_BITSTREAM_TYPE(VIDEO_BITSTREAM_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
