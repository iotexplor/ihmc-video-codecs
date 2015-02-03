/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.codecs.generated;

public class YUVPicture {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected YUVPicture(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YUVPicture obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ihmcVideoCodecsJNI.delete_YUVPicture(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static YUVPicture.YUVSubsamplingType getSubsamplingType(int yWidth, int yHeight, int uWidth, int uHeight, int vWidth, int vHeight) {
    return YUVPicture.YUVSubsamplingType.swigToEnum(ihmcVideoCodecsJNI.YUVPicture_getSubsamplingType(yWidth, yHeight, uWidth, uHeight, vWidth, vHeight));
  }

  static private long SwigConstructYUVPicture(YUVPicture.YUVSubsamplingType type, int width, int height, int yStride, int uStride, int vStride, java.nio.ByteBuffer Yin, java.nio.ByteBuffer Uin, java.nio.ByteBuffer Vin) {
  assert Yin.isDirect() : "Buffer must be allocated direct.";
  assert Uin.isDirect() : "Buffer must be allocated direct.";
  assert Vin.isDirect() : "Buffer must be allocated direct.";
    return ihmcVideoCodecsJNI.new_YUVPicture__SWIG_0(type.swigValue(), width, height, yStride, uStride, vStride, Yin, Uin, Vin);
  }

  public YUVPicture(YUVPicture.YUVSubsamplingType type, int width, int height, int yStride, int uStride, int vStride, java.nio.ByteBuffer Yin, java.nio.ByteBuffer Uin, java.nio.ByteBuffer Vin) {
    this(YUVPicture.SwigConstructYUVPicture(type, width, height, yStride, uStride, vStride, Yin, Uin, Vin), true);
  }

  public YUVPicture(YUVPicture.YUVSubsamplingType type, int width, int height) {
    this(ihmcVideoCodecsJNI.new_YUVPicture__SWIG_1(type.swigValue(), width, height), true);
  }

  public void scale(int newWidth, int newHeight, FilterModeEnum filterMode) {
    ihmcVideoCodecsJNI.YUVPicture_scale(swigCPtr, this, newWidth, newHeight, filterMode.swigValue());
  }

  public RGBPicture toRGB() {
    long cPtr = ihmcVideoCodecsJNI.YUVPicture_toRGB(swigCPtr, this);
    return (cPtr == 0) ? null : new RGBPicture(cPtr, true);
  }

  public YUVPicture.YUVSubsamplingType getType() {
    return YUVPicture.YUVSubsamplingType.swigToEnum(ihmcVideoCodecsJNI.YUVPicture_getType(swigCPtr, this));
  }

  public int getWidth() {
    return ihmcVideoCodecsJNI.YUVPicture_getWidth(swigCPtr, this);
  }

  public int getHeight() {
    return ihmcVideoCodecsJNI.YUVPicture_getHeight(swigCPtr, this);
  }

  public int getYStride() {
    return ihmcVideoCodecsJNI.YUVPicture_getYStride(swigCPtr, this);
  }

  public int getUStride() {
    return ihmcVideoCodecsJNI.YUVPicture_getUStride(swigCPtr, this);
  }

  public int getVStride() {
    return ihmcVideoCodecsJNI.YUVPicture_getVStride(swigCPtr, this);
  }

  public enum YUVSubsamplingType {
    YUV444,
    YUV422,
    YUV420,
    UNSUPPORTED;

    public final int swigValue() {
      return swigValue;
    }

    public static YUVSubsamplingType swigToEnum(int swigValue) {
      YUVSubsamplingType[] swigValues = YUVSubsamplingType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (YUVSubsamplingType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + YUVSubsamplingType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private YUVSubsamplingType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private YUVSubsamplingType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private YUVSubsamplingType(YUVSubsamplingType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
