/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public class SEncParamExt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SEncParamExt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SEncParamExt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        codec_apiJNI.delete_SEncParamExt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIUsageType(EUsageType value) {
    codec_apiJNI.SEncParamExt_iUsageType_set(swigCPtr, this, value.swigValue());
  }

  public EUsageType getIUsageType() {
    return EUsageType.swigToEnum(codec_apiJNI.SEncParamExt_iUsageType_get(swigCPtr, this));
  }

  public void setIPicWidth(int value) {
    codec_apiJNI.SEncParamExt_iPicWidth_set(swigCPtr, this, value);
  }

  public int getIPicWidth() {
    return codec_apiJNI.SEncParamExt_iPicWidth_get(swigCPtr, this);
  }

  public void setIPicHeight(int value) {
    codec_apiJNI.SEncParamExt_iPicHeight_set(swigCPtr, this, value);
  }

  public int getIPicHeight() {
    return codec_apiJNI.SEncParamExt_iPicHeight_get(swigCPtr, this);
  }

  public void setITargetBitrate(int value) {
    codec_apiJNI.SEncParamExt_iTargetBitrate_set(swigCPtr, this, value);
  }

  public int getITargetBitrate() {
    return codec_apiJNI.SEncParamExt_iTargetBitrate_get(swigCPtr, this);
  }

  public void setIRCMode(RC_MODES value) {
    codec_apiJNI.SEncParamExt_iRCMode_set(swigCPtr, this, value.swigValue());
  }

  public RC_MODES getIRCMode() {
    return RC_MODES.swigToEnum(codec_apiJNI.SEncParamExt_iRCMode_get(swigCPtr, this));
  }

  public void setFMaxFrameRate(float value) {
    codec_apiJNI.SEncParamExt_fMaxFrameRate_set(swigCPtr, this, value);
  }

  public float getFMaxFrameRate() {
    return codec_apiJNI.SEncParamExt_fMaxFrameRate_get(swigCPtr, this);
  }

  public void setITemporalLayerNum(int value) {
    codec_apiJNI.SEncParamExt_iTemporalLayerNum_set(swigCPtr, this, value);
  }

  public int getITemporalLayerNum() {
    return codec_apiJNI.SEncParamExt_iTemporalLayerNum_get(swigCPtr, this);
  }

  public void setISpatialLayerNum(int value) {
    codec_apiJNI.SEncParamExt_iSpatialLayerNum_set(swigCPtr, this, value);
  }

  public int getISpatialLayerNum() {
    return codec_apiJNI.SEncParamExt_iSpatialLayerNum_get(swigCPtr, this);
  }

  public void setSSpatialLayers(SSpatialLayerConfig value) {
    codec_apiJNI.SEncParamExt_sSpatialLayers_set(swigCPtr, this, SSpatialLayerConfig.getCPtr(value), value);
  }

  public SSpatialLayerConfig getSSpatialLayers() {
    long cPtr = codec_apiJNI.SEncParamExt_sSpatialLayers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SSpatialLayerConfig(cPtr, false);
  }

  public void setIComplexityMode(ECOMPLEXITY_MODE value) {
    codec_apiJNI.SEncParamExt_iComplexityMode_set(swigCPtr, this, value.swigValue());
  }

  public ECOMPLEXITY_MODE getIComplexityMode() {
    return ECOMPLEXITY_MODE.swigToEnum(codec_apiJNI.SEncParamExt_iComplexityMode_get(swigCPtr, this));
  }

  public void setUiIntraPeriod(long value) {
    codec_apiJNI.SEncParamExt_uiIntraPeriod_set(swigCPtr, this, value);
  }

  public long getUiIntraPeriod() {
    return codec_apiJNI.SEncParamExt_uiIntraPeriod_get(swigCPtr, this);
  }

  public void setINumRefFrame(int value) {
    codec_apiJNI.SEncParamExt_iNumRefFrame_set(swigCPtr, this, value);
  }

  public int getINumRefFrame() {
    return codec_apiJNI.SEncParamExt_iNumRefFrame_get(swigCPtr, this);
  }

  public void setBEnableSpsPpsIdAddition(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableSpsPpsIdAddition_set(swigCPtr, this, value);
  }

  public boolean getBEnableSpsPpsIdAddition() {
    return codec_apiJNI.SEncParamExt_bEnableSpsPpsIdAddition_get(swigCPtr, this);
  }

  public void setBPrefixNalAddingCtrl(boolean value) {
    codec_apiJNI.SEncParamExt_bPrefixNalAddingCtrl_set(swigCPtr, this, value);
  }

  public boolean getBPrefixNalAddingCtrl() {
    return codec_apiJNI.SEncParamExt_bPrefixNalAddingCtrl_get(swigCPtr, this);
  }

  public void setBEnableSSEI(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableSSEI_set(swigCPtr, this, value);
  }

  public boolean getBEnableSSEI() {
    return codec_apiJNI.SEncParamExt_bEnableSSEI_get(swigCPtr, this);
  }

  public void setIPaddingFlag(int value) {
    codec_apiJNI.SEncParamExt_iPaddingFlag_set(swigCPtr, this, value);
  }

  public int getIPaddingFlag() {
    return codec_apiJNI.SEncParamExt_iPaddingFlag_get(swigCPtr, this);
  }

  public void setIEntropyCodingModeFlag(int value) {
    codec_apiJNI.SEncParamExt_iEntropyCodingModeFlag_set(swigCPtr, this, value);
  }

  public int getIEntropyCodingModeFlag() {
    return codec_apiJNI.SEncParamExt_iEntropyCodingModeFlag_get(swigCPtr, this);
  }

  public void setBEnableFrameSkip(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableFrameSkip_set(swigCPtr, this, value);
  }

  public boolean getBEnableFrameSkip() {
    return codec_apiJNI.SEncParamExt_bEnableFrameSkip_get(swigCPtr, this);
  }

  public void setIMaxBitrate(int value) {
    codec_apiJNI.SEncParamExt_iMaxBitrate_set(swigCPtr, this, value);
  }

  public int getIMaxBitrate() {
    return codec_apiJNI.SEncParamExt_iMaxBitrate_get(swigCPtr, this);
  }

  public void setIMaxQp(int value) {
    codec_apiJNI.SEncParamExt_iMaxQp_set(swigCPtr, this, value);
  }

  public int getIMaxQp() {
    return codec_apiJNI.SEncParamExt_iMaxQp_get(swigCPtr, this);
  }

  public void setIMinQp(int value) {
    codec_apiJNI.SEncParamExt_iMinQp_set(swigCPtr, this, value);
  }

  public int getIMinQp() {
    return codec_apiJNI.SEncParamExt_iMinQp_get(swigCPtr, this);
  }

  public void setUiMaxNalSize(long value) {
    codec_apiJNI.SEncParamExt_uiMaxNalSize_set(swigCPtr, this, value);
  }

  public long getUiMaxNalSize() {
    return codec_apiJNI.SEncParamExt_uiMaxNalSize_get(swigCPtr, this);
  }

  public void setBEnableLongTermReference(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableLongTermReference_set(swigCPtr, this, value);
  }

  public boolean getBEnableLongTermReference() {
    return codec_apiJNI.SEncParamExt_bEnableLongTermReference_get(swigCPtr, this);
  }

  public void setILTRRefNum(int value) {
    codec_apiJNI.SEncParamExt_iLTRRefNum_set(swigCPtr, this, value);
  }

  public int getILTRRefNum() {
    return codec_apiJNI.SEncParamExt_iLTRRefNum_get(swigCPtr, this);
  }

  public void setILtrMarkPeriod(long value) {
    codec_apiJNI.SEncParamExt_iLtrMarkPeriod_set(swigCPtr, this, value);
  }

  public long getILtrMarkPeriod() {
    return codec_apiJNI.SEncParamExt_iLtrMarkPeriod_get(swigCPtr, this);
  }

  public void setIMultipleThreadIdc(int value) {
    codec_apiJNI.SEncParamExt_iMultipleThreadIdc_set(swigCPtr, this, value);
  }

  public int getIMultipleThreadIdc() {
    return codec_apiJNI.SEncParamExt_iMultipleThreadIdc_get(swigCPtr, this);
  }

  public void setILoopFilterDisableIdc(int value) {
    codec_apiJNI.SEncParamExt_iLoopFilterDisableIdc_set(swigCPtr, this, value);
  }

  public int getILoopFilterDisableIdc() {
    return codec_apiJNI.SEncParamExt_iLoopFilterDisableIdc_get(swigCPtr, this);
  }

  public void setILoopFilterAlphaC0Offset(int value) {
    codec_apiJNI.SEncParamExt_iLoopFilterAlphaC0Offset_set(swigCPtr, this, value);
  }

  public int getILoopFilterAlphaC0Offset() {
    return codec_apiJNI.SEncParamExt_iLoopFilterAlphaC0Offset_get(swigCPtr, this);
  }

  public void setILoopFilterBetaOffset(int value) {
    codec_apiJNI.SEncParamExt_iLoopFilterBetaOffset_set(swigCPtr, this, value);
  }

  public int getILoopFilterBetaOffset() {
    return codec_apiJNI.SEncParamExt_iLoopFilterBetaOffset_get(swigCPtr, this);
  }

  public void setBEnableDenoise(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableDenoise_set(swigCPtr, this, value);
  }

  public boolean getBEnableDenoise() {
    return codec_apiJNI.SEncParamExt_bEnableDenoise_get(swigCPtr, this);
  }

  public void setBEnableBackgroundDetection(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableBackgroundDetection_set(swigCPtr, this, value);
  }

  public boolean getBEnableBackgroundDetection() {
    return codec_apiJNI.SEncParamExt_bEnableBackgroundDetection_get(swigCPtr, this);
  }

  public void setBEnableAdaptiveQuant(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableAdaptiveQuant_set(swigCPtr, this, value);
  }

  public boolean getBEnableAdaptiveQuant() {
    return codec_apiJNI.SEncParamExt_bEnableAdaptiveQuant_get(swigCPtr, this);
  }

  public void setBEnableFrameCroppingFlag(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableFrameCroppingFlag_set(swigCPtr, this, value);
  }

  public boolean getBEnableFrameCroppingFlag() {
    return codec_apiJNI.SEncParamExt_bEnableFrameCroppingFlag_get(swigCPtr, this);
  }

  public void setBEnableSceneChangeDetect(boolean value) {
    codec_apiJNI.SEncParamExt_bEnableSceneChangeDetect_set(swigCPtr, this, value);
  }

  public boolean getBEnableSceneChangeDetect() {
    return codec_apiJNI.SEncParamExt_bEnableSceneChangeDetect_get(swigCPtr, this);
  }

  public SEncParamExt() {
    this(codec_apiJNI.new_SEncParamExt(), true);
  }

}