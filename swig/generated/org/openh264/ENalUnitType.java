/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public enum ENalUnitType {
  NAL_UNKNOWN(0),
  NAL_SLICE(1),
  NAL_SLICE_DPA(2),
  NAL_SLICE_DPB(3),
  NAL_SLICE_DPC(4),
  NAL_SLICE_IDR(5),
  NAL_SEI(6),
  NAL_SPS(7),
  NAL_PPS(8);

  public final int swigValue() {
    return swigValue;
  }

  public static ENalUnitType swigToEnum(int swigValue) {
    ENalUnitType[] swigValues = ENalUnitType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ENalUnitType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ENalUnitType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ENalUnitType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ENalUnitType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ENalUnitType(ENalUnitType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
