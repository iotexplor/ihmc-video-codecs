/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public class SFrameBSInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SFrameBSInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SFrameBSInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        codec_apiJNI.delete_SFrameBSInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setITemporalId(int value) {
    codec_apiJNI.SFrameBSInfo_iTemporalId_set(swigCPtr, this, value);
  }

  public int getITemporalId() {
    return codec_apiJNI.SFrameBSInfo_iTemporalId_get(swigCPtr, this);
  }

  public void setISubSeqId(int value) {
    codec_apiJNI.SFrameBSInfo_iSubSeqId_set(swigCPtr, this, value);
  }

  public int getISubSeqId() {
    return codec_apiJNI.SFrameBSInfo_iSubSeqId_get(swigCPtr, this);
  }

  public void setILayerNum(int value) {
    codec_apiJNI.SFrameBSInfo_iLayerNum_set(swigCPtr, this, value);
  }

  public int getILayerNum() {
    return codec_apiJNI.SFrameBSInfo_iLayerNum_get(swigCPtr, this);
  }

  public void setSLayerInfo(SLayerBSInfo value) {
    codec_apiJNI.SFrameBSInfo_sLayerInfo_set(swigCPtr, this, SLayerBSInfo.getCPtr(value), value);
  }

  public SLayerBSInfo getSLayerInfo() {
    long cPtr = codec_apiJNI.SFrameBSInfo_sLayerInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SLayerBSInfo(cPtr, false);
  }

  public void setEFrameType(EVideoFrameType value) {
    codec_apiJNI.SFrameBSInfo_eFrameType_set(swigCPtr, this, value.swigValue());
  }

  public EVideoFrameType getEFrameType() {
    return EVideoFrameType.swigToEnum(codec_apiJNI.SFrameBSInfo_eFrameType_get(swigCPtr, this));
  }

  public void setUiTimeStamp(long value) {
    codec_apiJNI.SFrameBSInfo_uiTimeStamp_set(swigCPtr, this, value);
  }

  public long getUiTimeStamp() {
    return codec_apiJNI.SFrameBSInfo_uiTimeStamp_get(swigCPtr, this);
  }

  public SLayerBSInfo getSLayerInfo(int frame) {
    long cPtr = codec_apiJNI.SFrameBSInfo_getSLayerInfo(swigCPtr, this, frame);
    return (cPtr == 0) ? null : new SLayerBSInfo(cPtr, false);
  }

  public SFrameBSInfo() {
    this(codec_apiJNI.new_SFrameBSInfo(), true);
  }

}
