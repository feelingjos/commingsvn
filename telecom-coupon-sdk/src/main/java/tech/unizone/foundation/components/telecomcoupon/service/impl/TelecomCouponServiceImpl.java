package tech.unizone.foundation.components.telecomcoupon.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import tech.unizone.foundation.components.telecomcoupon.common.ApiConstant;
import tech.unizone.foundation.components.telecomcoupon.req.*;
import tech.unizone.foundation.components.telecomcoupon.resp.*;
import tech.unizone.foundation.components.telecomcoupon.service.TelecomCouponService;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 14:58
 * @Description:
 */
public class TelecomCouponServiceImpl implements TelecomCouponService {

    @Override
    public ReceiveCouponsResponseDTO receiveCoupons(ReceiveCouponsRequestDTO receiveCouponsRequest) {
        JSONObject jsonObject= JSONUtil.parseObj(HttpRequest.post(ApiConstant.API_ENTRY_STAGING).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(receiveCouponsRequest)).execute().body());
        ReceiveCouponsResponseDTO voucherAcquisitionRecordResponse=jsonObject.toBean(ReceiveCouponsResponseDTO.class,true);
        return voucherAcquisitionRecordResponse;
    }

    @Override
    public VoucherAcquisitionRecordResponseDTO preferentialVoucherReceiptRecord(VoucherAcquisitionRecordRequestDTO voucherAcquisitionRecordRequest) {
        JSONObject jobj= JSONUtil.parseObj(HttpRequest.post(ApiConstant.API_ENTRY_STAGING).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(voucherAcquisitionRecordRequest)).execute().body());
        VoucherAcquisitionRecordResponseDTO voucherAcquisitionRecordResponse=jobj.toBean(VoucherAcquisitionRecordResponseDTO.class);
        return voucherAcquisitionRecordResponse;
    }

    @Override
    public ViewUserCardPackResponseDTO queryUserCardPack(ViewUserCardPackRequestDTO viewUserCardPackRequest) {
        JSONObject jsonObject= JSONUtil.parseObj(HttpRequest.post(ApiConstant.API_ENTRY_STAGING).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(viewUserCardPackRequest)).execute().body());
        ViewUserCardPackResponseDTO voucherAcquisitionRecordResponse=jsonObject.toBean(ViewUserCardPackResponseDTO.class);

        return voucherAcquisitionRecordResponse;
    }

    @Override
    public VoucherDefinitionInformationResponseDTO discountDefinitionInformationQuery(CouponDefinitionInfoRequestDTO couponDefinitionInfoRequest) {

        JSONObject jsonObject= JSONUtil.parseObj(HttpRequest.post(ApiConstant.API_ENTRY_STAGING).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(couponDefinitionInfoRequest)).execute().body());
        VoucherDefinitionInformationResponseDTO voucherAcquisitionRecordResponse=jsonObject.toBean(VoucherDefinitionInformationResponseDTO.class,true);

        return voucherAcquisitionRecordResponse;
    }

    @Override
    @Deprecated
    public NoticeResponseDTO noticeofCompletionWriteoff(WriteOffRequestDTO writeOffRequest) {

        JSONObject jsonObject= JSONUtil.parseObj(HttpRequest.post(ApiConstant.API_ENTRY_STAGING).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(writeOffRequest)).execute().body());
        NoticeResponseDTO noticeResponse=jsonObject.toBean(NoticeResponseDTO.class);

        return noticeResponse;
    }

    @Override
    public NoticeResponseDTO couponcancellationinterface(CouponCancellationRequestDTO couponCancellationRequest) {

        JSONObject jsonObject= JSONUtil.parseObj(HttpRequest.post(ApiConstant.API_ENTRY_STAGING).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(couponCancellationRequest)).execute().body());
        NoticeResponseDTO noticeResponse=jsonObject.toBean(NoticeResponseDTO.class);

        return noticeResponse;
    }

    @Override
    public NoticeResponseDTO VerificationCallbackNotificationInterface(String notifyUrl, WriteoffCallbackRequestDTO writeoffCallbackRequest) {
        JSONObject jsonObject= JSONUtil.parseObj(HttpRequest.post(notifyUrl).charset(ApiConstant.GBK).form(BeanUtil.beanToMap(writeoffCallbackRequest)).execute().body());
        NoticeResponseDTO noticeResponse=jsonObject.toBean(NoticeResponseDTO.class);

        return noticeResponse;
    }
}
