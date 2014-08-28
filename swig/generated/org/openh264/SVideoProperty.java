/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public class SVideoProperty {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SVideoProperty(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SVideoProperty obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        codec_apiJNI.delete_SVideoProperty(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSize(long value) {
    codec_apiJNI.SVideoProperty_size_set(swigCPtr, this, value);
  }

  public long getSize() {
    return codec_apiJNI.SVideoProperty_size_get(swigCPtr, this);
  }

  public void setEVideoBsType(VIDEO_BITSTREAM_TYPE value) {
    codec_apiJNI.SVideoProperty_eVideoBsType_set(swigCPtr, this, value.swigValue());
  }

  public VIDEO_BITSTREAM_TYPE getEVideoBsType() {
    return VIDEO_BITSTREAM_TYPE.swigToEnum(codec_apiJNI.SVideoProperty_eVideoBsType_get(swigCPtr, this));
  }

  public SVideoProperty() {
    this(codec_apiJNI.new_SVideoProperty(), true);
  }

}