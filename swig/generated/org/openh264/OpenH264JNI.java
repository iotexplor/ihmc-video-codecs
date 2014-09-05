/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openh264;

public class OpenH264JNI {
  public final static native int ISVCEncoder_Initialize(long jarg1, ISVCEncoder jarg1_, long jarg2, SEncParamBase jarg2_);
  public final static native int ISVCEncoder_InitializeExt(long jarg1, ISVCEncoder jarg1_, long jarg2, SEncParamExt jarg2_);
  public final static native int ISVCEncoder_GetDefaultParams(long jarg1, ISVCEncoder jarg1_, long jarg2, SEncParamExt jarg2_);
  public final static native int ISVCEncoder_Uninitialize(long jarg1, ISVCEncoder jarg1_);
  public final static native int ISVCEncoder_EncodeFrame(long jarg1, ISVCEncoder jarg1_, long jarg2, SSourcePicture jarg2_, long jarg3, SFrameBSInfo jarg3_);
  public final static native int ISVCEncoder_EncodeParameterSets(long jarg1, ISVCEncoder jarg1_, long jarg2, SFrameBSInfo jarg2_);
  public final static native int ISVCEncoder_PauseFrame(long jarg1, ISVCEncoder jarg1_, long jarg2, SSourcePicture jarg2_, long jarg3, SFrameBSInfo jarg3_);
  public final static native int ISVCEncoder_ForceIntraFrame(long jarg1, ISVCEncoder jarg1_, boolean jarg2);
  public final static native void delete_ISVCEncoder(long jarg1);
  public final static native int ISVCEncoder_SetOption__SWIG_0(long jarg1, ISVCEncoder jarg1_, int jarg2, int jarg3);
  public final static native int ISVCEncoder_SetOption__SWIG_1(long jarg1, ISVCEncoder jarg1_, int jarg2, boolean jarg3);
  public final static native int ISVCEncoder_SetOption__SWIG_2(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SEncParamBase jarg3_);
  public final static native long ISVCEncoder_GetSEncParamBaseOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_3(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SEncParamExt jarg3_);
  public final static native long ISVCEncoder_GetSEncParamExtOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_4(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SProfileInfo jarg3_);
  public final static native long ISVCEncoder_GetSProfileInfoOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_5(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SLevelInfo jarg3_);
  public final static native long ISVCEncoder_GetSLevelInfoOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_6(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SDeliveryStatus jarg3_);
  public final static native long ISVCEncoder_GetSDeliveryStatusOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_7(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SLTRRecoverRequest jarg3_);
  public final static native long ISVCEncoder_GetSLTRRecoverRequestOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_8(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SLTRMarkingFeedback jarg3_);
  public final static native long ISVCEncoder_GetSLTRMarkingFeedbackOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_9(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SDumpLayer jarg3_);
  public final static native long ISVCEncoder_GetSDumpLayerOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_SetOption__SWIG_10(long jarg1, ISVCEncoder jarg1_, int jarg2, long jarg3, SBitrateInfo jarg3_);
  public final static native long ISVCEncoder_GetSBitrateInfoOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCEncoder_GetIntOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native boolean ISVCEncoder_GetBoolOption(long jarg1, ISVCEncoder jarg1_, int jarg2);
  public final static native int ISVCDecoder_Initialize(long jarg1, ISVCDecoder jarg1_, long jarg2, SDecodingParam jarg2_);
  public final static native int ISVCDecoder_Uninitialize(long jarg1, ISVCDecoder jarg1_);
  public final static native void delete_ISVCDecoder(long jarg1);
  public final static native int ISVCDecoder_DecodeFrame2__SWIG_0(long jarg1, ISVCDecoder jarg1_, java.nio.ByteBuffer jarg2, int jarg3, long jarg4, STargetPicture jarg4_);
  public final static native int ISVCDecoder_DecodeFrame2__SWIG_1(long jarg1, ISVCDecoder jarg1_, long jarg2, STargetPicture jarg2_);
  public final static native int ISVCDecoder_SetOption__SWIG_0(long jarg1, ISVCDecoder jarg1_, int jarg2, int jarg3);
  public final static native int ISVCDecoder_SetOption__SWIG_1(long jarg1, ISVCDecoder jarg1_, int jarg2, boolean jarg3);
  public final static native int ISVCDecoder_GetIntOption(long jarg1, ISVCDecoder jarg1_, int jarg2);
  public final static native boolean ISVCDecoder_GetBoolOption(long jarg1, ISVCDecoder jarg1_, int jarg2);
  public final static native void WelsDestroySVCEncoder(long jarg1, ISVCEncoder jarg1_);
  public final static native void WelsDestroyDecoder(long jarg1, ISVCDecoder jarg1_);
  public final static native void SLTRRecoverRequest_uiFeedbackType_set(long jarg1, SLTRRecoverRequest jarg1_, long jarg2);
  public final static native long SLTRRecoverRequest_uiFeedbackType_get(long jarg1, SLTRRecoverRequest jarg1_);
  public final static native void SLTRRecoverRequest_uiIDRPicId_set(long jarg1, SLTRRecoverRequest jarg1_, long jarg2);
  public final static native long SLTRRecoverRequest_uiIDRPicId_get(long jarg1, SLTRRecoverRequest jarg1_);
  public final static native void SLTRRecoverRequest_iLastCorrectFrameNum_set(long jarg1, SLTRRecoverRequest jarg1_, int jarg2);
  public final static native int SLTRRecoverRequest_iLastCorrectFrameNum_get(long jarg1, SLTRRecoverRequest jarg1_);
  public final static native void SLTRRecoverRequest_iCurrentFrameNum_set(long jarg1, SLTRRecoverRequest jarg1_, int jarg2);
  public final static native int SLTRRecoverRequest_iCurrentFrameNum_get(long jarg1, SLTRRecoverRequest jarg1_);
  public final static native long new_SLTRRecoverRequest();
  public final static native void delete_SLTRRecoverRequest(long jarg1);
  public final static native void SLTRMarkingFeedback_uiFeedbackType_set(long jarg1, SLTRMarkingFeedback jarg1_, long jarg2);
  public final static native long SLTRMarkingFeedback_uiFeedbackType_get(long jarg1, SLTRMarkingFeedback jarg1_);
  public final static native void SLTRMarkingFeedback_uiIDRPicId_set(long jarg1, SLTRMarkingFeedback jarg1_, long jarg2);
  public final static native long SLTRMarkingFeedback_uiIDRPicId_get(long jarg1, SLTRMarkingFeedback jarg1_);
  public final static native void SLTRMarkingFeedback_iLTRFrameNum_set(long jarg1, SLTRMarkingFeedback jarg1_, int jarg2);
  public final static native int SLTRMarkingFeedback_iLTRFrameNum_get(long jarg1, SLTRMarkingFeedback jarg1_);
  public final static native long new_SLTRMarkingFeedback();
  public final static native void delete_SLTRMarkingFeedback(long jarg1);
  public final static native void SSliceArgument_uiSliceMbNum_set(long jarg1, SSliceArgument jarg1_, long[] jarg2);
  public final static native long[] SSliceArgument_uiSliceMbNum_get(long jarg1, SSliceArgument jarg1_);
  public final static native void SSliceArgument_uiSliceNum_set(long jarg1, SSliceArgument jarg1_, long jarg2);
  public final static native long SSliceArgument_uiSliceNum_get(long jarg1, SSliceArgument jarg1_);
  public final static native void SSliceArgument_uiSliceSizeConstraint_set(long jarg1, SSliceArgument jarg1_, long jarg2);
  public final static native long SSliceArgument_uiSliceSizeConstraint_get(long jarg1, SSliceArgument jarg1_);
  public final static native long new_SSliceArgument();
  public final static native void delete_SSliceArgument(long jarg1);
  public final static native void SSliceConfig_uiSliceMode_set(long jarg1, SSliceConfig jarg1_, int jarg2);
  public final static native int SSliceConfig_uiSliceMode_get(long jarg1, SSliceConfig jarg1_);
  public final static native void SSliceConfig_sSliceArgument_set(long jarg1, SSliceConfig jarg1_, long jarg2, SSliceArgument jarg2_);
  public final static native long SSliceConfig_sSliceArgument_get(long jarg1, SSliceConfig jarg1_);
  public final static native long new_SSliceConfig();
  public final static native void delete_SSliceConfig(long jarg1);
  public final static native void SSpatialLayerConfig_iVideoWidth_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_iVideoWidth_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_iVideoHeight_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_iVideoHeight_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_fFrameRate_set(long jarg1, SSpatialLayerConfig jarg1_, float jarg2);
  public final static native float SSpatialLayerConfig_fFrameRate_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_iSpatialBitrate_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_iSpatialBitrate_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_iMaxSpatialBitrate_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_iMaxSpatialBitrate_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_uiProfileIdc_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_uiProfileIdc_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_uiLevelIdc_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_uiLevelIdc_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_iDLayerQp_set(long jarg1, SSpatialLayerConfig jarg1_, int jarg2);
  public final static native int SSpatialLayerConfig_iDLayerQp_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native void SSpatialLayerConfig_sSliceCfg_set(long jarg1, SSpatialLayerConfig jarg1_, long jarg2, SSliceConfig jarg2_);
  public final static native long SSpatialLayerConfig_sSliceCfg_get(long jarg1, SSpatialLayerConfig jarg1_);
  public final static native long new_SSpatialLayerConfig();
  public final static native void delete_SSpatialLayerConfig(long jarg1);
  public final static native void SEncParamBase_iUsageType_set(long jarg1, SEncParamBase jarg1_, int jarg2);
  public final static native int SEncParamBase_iUsageType_get(long jarg1, SEncParamBase jarg1_);
  public final static native void SEncParamBase_iInputCsp_set(long jarg1, SEncParamBase jarg1_, int jarg2);
  public final static native int SEncParamBase_iInputCsp_get(long jarg1, SEncParamBase jarg1_);
  public final static native void SEncParamBase_iPicWidth_set(long jarg1, SEncParamBase jarg1_, int jarg2);
  public final static native int SEncParamBase_iPicWidth_get(long jarg1, SEncParamBase jarg1_);
  public final static native void SEncParamBase_iPicHeight_set(long jarg1, SEncParamBase jarg1_, int jarg2);
  public final static native int SEncParamBase_iPicHeight_get(long jarg1, SEncParamBase jarg1_);
  public final static native void SEncParamBase_iTargetBitrate_set(long jarg1, SEncParamBase jarg1_, int jarg2);
  public final static native int SEncParamBase_iTargetBitrate_get(long jarg1, SEncParamBase jarg1_);
  public final static native void SEncParamBase_iRCMode_set(long jarg1, SEncParamBase jarg1_, int jarg2);
  public final static native int SEncParamBase_iRCMode_get(long jarg1, SEncParamBase jarg1_);
  public final static native void SEncParamBase_fMaxFrameRate_set(long jarg1, SEncParamBase jarg1_, float jarg2);
  public final static native float SEncParamBase_fMaxFrameRate_get(long jarg1, SEncParamBase jarg1_);
  public final static native long new_SEncParamBase();
  public final static native void delete_SEncParamBase(long jarg1);
  public final static native void SEncParamExt_iUsageType_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iUsageType_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iInputCsp_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iInputCsp_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iPicWidth_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iPicWidth_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iPicHeight_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iPicHeight_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iTargetBitrate_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iTargetBitrate_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iRCMode_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iRCMode_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_fMaxFrameRate_set(long jarg1, SEncParamExt jarg1_, float jarg2);
  public final static native float SEncParamExt_fMaxFrameRate_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iTemporalLayerNum_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iTemporalLayerNum_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iSpatialLayerNum_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iSpatialLayerNum_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_uiIntraPeriod_set(long jarg1, SEncParamExt jarg1_, long jarg2);
  public final static native long SEncParamExt_uiIntraPeriod_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iNumRefFrame_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iNumRefFrame_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_uiFrameToBeCoded_set(long jarg1, SEncParamExt jarg1_, long jarg2);
  public final static native long SEncParamExt_uiFrameToBeCoded_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableSpsPpsIdAddition_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableSpsPpsIdAddition_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bPrefixNalAddingCtrl_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bPrefixNalAddingCtrl_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableSSEI_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableSSEI_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iPaddingFlag_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iPaddingFlag_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iEntropyCodingModeFlag_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iEntropyCodingModeFlag_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableFrameSkip_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableFrameSkip_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iMaxBitrate_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iMaxBitrate_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iMaxQp_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iMaxQp_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iMinQp_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iMinQp_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_uiMaxNalSize_set(long jarg1, SEncParamExt jarg1_, long jarg2);
  public final static native long SEncParamExt_uiMaxNalSize_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableLongTermReference_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableLongTermReference_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iLTRRefNum_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iLTRRefNum_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iLtrMarkPeriod_set(long jarg1, SEncParamExt jarg1_, long jarg2);
  public final static native long SEncParamExt_iLtrMarkPeriod_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iMultipleThreadIdc_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iMultipleThreadIdc_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iLoopFilterDisableIdc_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iLoopFilterDisableIdc_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iLoopFilterAlphaC0Offset_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iLoopFilterAlphaC0Offset_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_iLoopFilterBetaOffset_set(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native int SEncParamExt_iLoopFilterBetaOffset_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableDenoise_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableDenoise_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableBackgroundDetection_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableBackgroundDetection_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableAdaptiveQuant_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableAdaptiveQuant_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableFrameCroppingFlag_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableFrameCroppingFlag_get(long jarg1, SEncParamExt jarg1_);
  public final static native void SEncParamExt_bEnableSceneChangeDetect_set(long jarg1, SEncParamExt jarg1_, boolean jarg2);
  public final static native boolean SEncParamExt_bEnableSceneChangeDetect_get(long jarg1, SEncParamExt jarg1_);
  public final static native long SEncParamExt_getSpatialLayer(long jarg1, SEncParamExt jarg1_, int jarg2);
  public final static native long new_SEncParamExt();
  public final static native void delete_SEncParamExt(long jarg1);
  public final static native void SVideoProperty_size_set(long jarg1, SVideoProperty jarg1_, long jarg2);
  public final static native long SVideoProperty_size_get(long jarg1, SVideoProperty jarg1_);
  public final static native void SVideoProperty_eVideoBsType_set(long jarg1, SVideoProperty jarg1_, int jarg2);
  public final static native int SVideoProperty_eVideoBsType_get(long jarg1, SVideoProperty jarg1_);
  public final static native long new_SVideoProperty();
  public final static native void delete_SVideoProperty(long jarg1);
  public final static native void SDecodingParam_pFileNameRestructed_set(long jarg1, SDecodingParam jarg1_, String jarg2);
  public final static native String SDecodingParam_pFileNameRestructed_get(long jarg1, SDecodingParam jarg1_);
  public final static native void SDecodingParam_iOutputColorFormat_set(long jarg1, SDecodingParam jarg1_, int jarg2);
  public final static native int SDecodingParam_iOutputColorFormat_get(long jarg1, SDecodingParam jarg1_);
  public final static native void SDecodingParam_uiCpuLoad_set(long jarg1, SDecodingParam jarg1_, long jarg2);
  public final static native long SDecodingParam_uiCpuLoad_get(long jarg1, SDecodingParam jarg1_);
  public final static native void SDecodingParam_uiTargetDqLayer_set(long jarg1, SDecodingParam jarg1_, short jarg2);
  public final static native short SDecodingParam_uiTargetDqLayer_get(long jarg1, SDecodingParam jarg1_);
  public final static native void SDecodingParam_uiEcActiveFlag_set(long jarg1, SDecodingParam jarg1_, short jarg2);
  public final static native short SDecodingParam_uiEcActiveFlag_get(long jarg1, SDecodingParam jarg1_);
  public final static native void SDecodingParam_sVideoProperty_set(long jarg1, SDecodingParam jarg1_, long jarg2, SVideoProperty jarg2_);
  public final static native long SDecodingParam_sVideoProperty_get(long jarg1, SDecodingParam jarg1_);
  public final static native long new_SDecodingParam();
  public final static native void delete_SDecodingParam(long jarg1);
  public final static native void SLayerBSInfo_uiTemporalId_set(long jarg1, SLayerBSInfo jarg1_, short jarg2);
  public final static native short SLayerBSInfo_uiTemporalId_get(long jarg1, SLayerBSInfo jarg1_);
  public final static native void SLayerBSInfo_uiSpatialId_set(long jarg1, SLayerBSInfo jarg1_, short jarg2);
  public final static native short SLayerBSInfo_uiSpatialId_get(long jarg1, SLayerBSInfo jarg1_);
  public final static native void SLayerBSInfo_uiQualityId_set(long jarg1, SLayerBSInfo jarg1_, short jarg2);
  public final static native short SLayerBSInfo_uiQualityId_get(long jarg1, SLayerBSInfo jarg1_);
  public final static native void SLayerBSInfo_uiLayerType_set(long jarg1, SLayerBSInfo jarg1_, short jarg2);
  public final static native short SLayerBSInfo_uiLayerType_get(long jarg1, SLayerBSInfo jarg1_);
  public final static native void SLayerBSInfo_iNalCount_set(long jarg1, SLayerBSInfo jarg1_, int jarg2);
  public final static native int SLayerBSInfo_iNalCount_get(long jarg1, SLayerBSInfo jarg1_);
  public final static native int SLayerBSInfo_getPBsBufSize(long jarg1, SLayerBSInfo jarg1_);
  public final static native void SLayerBSInfo_getPBsBuf(long jarg1, SLayerBSInfo jarg1_, java.nio.ByteBuffer jarg2);
  public final static native int SLayerBSInfo_getNalLengthInByte(long jarg1, SLayerBSInfo jarg1_, int jarg2);
  public final static native void SLayerBSInfo_getNal(long jarg1, SLayerBSInfo jarg1_, int jarg2, java.nio.ByteBuffer jarg3);
  public final static native long new_SLayerBSInfo();
  public final static native void delete_SLayerBSInfo(long jarg1);
  public final static native void SFrameBSInfo_iTemporalId_set(long jarg1, SFrameBSInfo jarg1_, int jarg2);
  public final static native int SFrameBSInfo_iTemporalId_get(long jarg1, SFrameBSInfo jarg1_);
  public final static native void SFrameBSInfo_iSubSeqId_set(long jarg1, SFrameBSInfo jarg1_, int jarg2);
  public final static native int SFrameBSInfo_iSubSeqId_get(long jarg1, SFrameBSInfo jarg1_);
  public final static native void SFrameBSInfo_iLayerNum_set(long jarg1, SFrameBSInfo jarg1_, int jarg2);
  public final static native int SFrameBSInfo_iLayerNum_get(long jarg1, SFrameBSInfo jarg1_);
  public final static native void SFrameBSInfo_sLayerInfo_set(long jarg1, SFrameBSInfo jarg1_, long jarg2, SLayerBSInfo jarg2_);
  public final static native long SFrameBSInfo_sLayerInfo_get(long jarg1, SFrameBSInfo jarg1_);
  public final static native void SFrameBSInfo_eFrameType_set(long jarg1, SFrameBSInfo jarg1_, int jarg2);
  public final static native int SFrameBSInfo_eFrameType_get(long jarg1, SFrameBSInfo jarg1_);
  public final static native void SFrameBSInfo_uiTimeStamp_set(long jarg1, SFrameBSInfo jarg1_, long jarg2);
  public final static native long SFrameBSInfo_uiTimeStamp_get(long jarg1, SFrameBSInfo jarg1_);
  public final static native long SFrameBSInfo_getSLayerInfo(long jarg1, SFrameBSInfo jarg1_, int jarg2);
  public final static native long new_SFrameBSInfo();
  public final static native void delete_SFrameBSInfo(long jarg1);
  public final static native void SSourcePicture_iColorFormat_set(long jarg1, SSourcePicture jarg1_, int jarg2);
  public final static native int SSourcePicture_iColorFormat_get(long jarg1, SSourcePicture jarg1_);
  public final static native void SSourcePicture_iStride_set(long jarg1, SSourcePicture jarg1_, int[] jarg2);
  public final static native int[] SSourcePicture_iStride_get(long jarg1, SSourcePicture jarg1_);
  public final static native void SSourcePicture_iPicWidth_set(long jarg1, SSourcePicture jarg1_, int jarg2);
  public final static native int SSourcePicture_iPicWidth_get(long jarg1, SSourcePicture jarg1_);
  public final static native void SSourcePicture_iPicHeight_set(long jarg1, SSourcePicture jarg1_, int jarg2);
  public final static native int SSourcePicture_iPicHeight_get(long jarg1, SSourcePicture jarg1_);
  public final static native void SSourcePicture_uiTimeStamp_set(long jarg1, SSourcePicture jarg1_, long jarg2);
  public final static native long SSourcePicture_uiTimeStamp_get(long jarg1, SSourcePicture jarg1_);
  public final static native void SSourcePicture_setPData(long jarg1, SSourcePicture jarg1_, int jarg2, java.nio.ByteBuffer jarg3);
  public final static native long new_SSourcePicture();
  public final static native void delete_SSourcePicture(long jarg1);
  public final static native void SBitrateInfo_iLayer_set(long jarg1, SBitrateInfo jarg1_, int jarg2);
  public final static native int SBitrateInfo_iLayer_get(long jarg1, SBitrateInfo jarg1_);
  public final static native void SBitrateInfo_iBitrate_set(long jarg1, SBitrateInfo jarg1_, int jarg2);
  public final static native int SBitrateInfo_iBitrate_get(long jarg1, SBitrateInfo jarg1_);
  public final static native long new_SBitrateInfo();
  public final static native void delete_SBitrateInfo(long jarg1);
  public final static native void SDumpLayer_iLayer_set(long jarg1, SDumpLayer jarg1_, int jarg2);
  public final static native int SDumpLayer_iLayer_get(long jarg1, SDumpLayer jarg1_);
  public final static native void SDumpLayer_pFileName_set(long jarg1, SDumpLayer jarg1_, String jarg2);
  public final static native String SDumpLayer_pFileName_get(long jarg1, SDumpLayer jarg1_);
  public final static native long new_SDumpLayer();
  public final static native void delete_SDumpLayer(long jarg1);
  public final static native void SProfileInfo_iLayer_set(long jarg1, SProfileInfo jarg1_, int jarg2);
  public final static native int SProfileInfo_iLayer_get(long jarg1, SProfileInfo jarg1_);
  public final static native void SProfileInfo_uiProfileIdc_set(long jarg1, SProfileInfo jarg1_, int jarg2);
  public final static native int SProfileInfo_uiProfileIdc_get(long jarg1, SProfileInfo jarg1_);
  public final static native long new_SProfileInfo();
  public final static native void delete_SProfileInfo(long jarg1);
  public final static native void SLevelInfo_iLayer_set(long jarg1, SLevelInfo jarg1_, int jarg2);
  public final static native int SLevelInfo_iLayer_get(long jarg1, SLevelInfo jarg1_);
  public final static native void SLevelInfo_uiLevelIdc_set(long jarg1, SLevelInfo jarg1_, int jarg2);
  public final static native int SLevelInfo_uiLevelIdc_get(long jarg1, SLevelInfo jarg1_);
  public final static native long new_SLevelInfo();
  public final static native void delete_SLevelInfo(long jarg1);
  public final static native void SDeliveryStatus_iDropNum_set(long jarg1, SDeliveryStatus jarg1_, int jarg2);
  public final static native int SDeliveryStatus_iDropNum_get(long jarg1, SDeliveryStatus jarg1_);
  public final static native void SDeliveryStatus_iDropFrameType_set(long jarg1, SDeliveryStatus jarg1_, int jarg2);
  public final static native int SDeliveryStatus_iDropFrameType_get(long jarg1, SDeliveryStatus jarg1_);
  public final static native void SDeliveryStatus_iDropFrameSize_set(long jarg1, SDeliveryStatus jarg1_, int jarg2);
  public final static native int SDeliveryStatus_iDropFrameSize_get(long jarg1, SDeliveryStatus jarg1_);
  public final static native long new_SDeliveryStatus();
  public final static native void delete_SDeliveryStatus(long jarg1);
  public final static native void SliceInfo_iCodedSliceCount_set(long jarg1, SliceInfo jarg1_, int jarg2);
  public final static native int SliceInfo_iCodedSliceCount_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_iFecType_set(long jarg1, SliceInfo jarg1_, int jarg2);
  public final static native int SliceInfo_iFecType_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_uiSliceIdx_set(long jarg1, SliceInfo jarg1_, short jarg2);
  public final static native short SliceInfo_uiSliceIdx_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_uiSliceCount_set(long jarg1, SliceInfo jarg1_, short jarg2);
  public final static native short SliceInfo_uiSliceCount_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_iFrameIndex_set(long jarg1, SliceInfo jarg1_, char jarg2);
  public final static native char SliceInfo_iFrameIndex_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_uiNalRefIdc_set(long jarg1, SliceInfo jarg1_, short jarg2);
  public final static native short SliceInfo_uiNalRefIdc_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_uiNalType_set(long jarg1, SliceInfo jarg1_, short jarg2);
  public final static native short SliceInfo_uiNalType_get(long jarg1, SliceInfo jarg1_);
  public final static native void SliceInfo_uiContainingFinalNal_set(long jarg1, SliceInfo jarg1_, short jarg2);
  public final static native short SliceInfo_uiContainingFinalNal_get(long jarg1, SliceInfo jarg1_);
  public final static native int SliceInfo_getLengthOfSlices(long jarg1, SliceInfo jarg1_, int jarg2);
  public final static native void SliceInfo_getSlice(long jarg1, SliceInfo jarg1_, int jarg2, java.nio.ByteBuffer jarg3);
  public final static native long new_SliceInfo();
  public final static native void delete_SliceInfo(long jarg1);
  public final static native void SRateThresholds_iWidth_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iWidth_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iHeight_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iHeight_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iThresholdOfInitRate_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iThresholdOfInitRate_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iThresholdOfMaxRate_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iThresholdOfMaxRate_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iThresholdOfMinRate_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iThresholdOfMinRate_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iMinThresholdFrameRate_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iMinThresholdFrameRate_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iSkipFrameRate_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iSkipFrameRate_get(long jarg1, SRateThresholds jarg1_);
  public final static native void SRateThresholds_iSkipFrameStep_set(long jarg1, SRateThresholds jarg1_, int jarg2);
  public final static native int SRateThresholds_iSkipFrameStep_get(long jarg1, SRateThresholds jarg1_);
  public final static native long new_SRateThresholds();
  public final static native void delete_SRateThresholds(long jarg1);
  public final static native void SSysMEMBuffer_iWidth_set(long jarg1, SSysMEMBuffer jarg1_, int jarg2);
  public final static native int SSysMEMBuffer_iWidth_get(long jarg1, SSysMEMBuffer jarg1_);
  public final static native void SSysMEMBuffer_iHeight_set(long jarg1, SSysMEMBuffer jarg1_, int jarg2);
  public final static native int SSysMEMBuffer_iHeight_get(long jarg1, SSysMEMBuffer jarg1_);
  public final static native void SSysMEMBuffer_iFormat_set(long jarg1, SSysMEMBuffer jarg1_, int jarg2);
  public final static native int SSysMEMBuffer_iFormat_get(long jarg1, SSysMEMBuffer jarg1_);
  public final static native void SSysMEMBuffer_iStride_set(long jarg1, SSysMEMBuffer jarg1_, int[] jarg2);
  public final static native int[] SSysMEMBuffer_iStride_get(long jarg1, SSysMEMBuffer jarg1_);
  public final static native long new_SSysMEMBuffer();
  public final static native void delete_SSysMEMBuffer(long jarg1);
  public final static native void SBufferInfo_iBufferStatus_set(long jarg1, SBufferInfo jarg1_, int jarg2);
  public final static native int SBufferInfo_iBufferStatus_get(long jarg1, SBufferInfo jarg1_);
  public final static native long SBufferInfo_getUsrData(long jarg1, SBufferInfo jarg1_);
  public final static native long new_SBufferInfo();
  public final static native void delete_SBufferInfo(long jarg1);
  public final static native long ksRateThrMap_get();
  public final static native String kiKeyNumMultiple_get();
  public final static native long STargetPicture_info_get(long jarg1, STargetPicture jarg1_);
  public final static native long new_STargetPicture();
  public final static native void STargetPicture_getY(long jarg1, STargetPicture jarg1_, java.nio.ByteBuffer jarg2);
  public final static native void STargetPicture_getU(long jarg1, STargetPicture jarg1_, java.nio.ByteBuffer jarg2);
  public final static native void STargetPicture_getV(long jarg1, STargetPicture jarg1_, java.nio.ByteBuffer jarg2);
  public final static native void delete_STargetPicture(long jarg1);
  public final static native long WelsCreateSVCEncoder();
  public final static native long WelsCreateDecoder();
}
