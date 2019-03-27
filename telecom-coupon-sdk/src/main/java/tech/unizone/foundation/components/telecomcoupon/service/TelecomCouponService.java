package tech.unizone.foundation.components.telecomcoupon.service;

import tech.unizone.foundation.components.telecomcoupon.req.*;
import tech.unizone.foundation.components.telecomcoupon.resp.*;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 14:56
 * @Description:
 */
public interface TelecomCouponService {

    /**
     * 1.2.2	领取优惠券
     * @param receiveCouponsRequest
     * @return
     */
    ReceiveCouponsResponseDTO receiveCoupons(ReceiveCouponsRequestDTO receiveCouponsRequest);

    /**
     * 1.2.3	优惠券领用记录详情
     * @param voucherAcquisitionRecordRequest
     * @return
     */
    VoucherAcquisitionRecordResponseDTO preferentialVoucherReceiptRecord(VoucherAcquisitionRecordRequestDTO voucherAcquisitionRecordRequest);


    /**
     * 1.2.4	查询用户卡包
     * @param viewUserCardPackRequest
     * @return
     */
    ViewUserCardPackResponseDTO queryUserCardPack(ViewUserCardPackRequestDTO viewUserCardPackRequest);

    /**
     * 1.2.5	优惠券定义信息查询
     * @param couponDefinitionInfoRequest
     * @return
     */
    VoucherDefinitionInformationResponseDTO discountDefinitionInformationQuery(CouponDefinitionInfoRequestDTO couponDefinitionInfoRequest);

    /**
     * 	核销完成通知接口
     * @param writeOffRequest
     * @return
     */
    @Deprecated
    NoticeResponseDTO noticeofCompletionWriteoff(WriteOffRequestDTO writeOffRequest);

    /**
     * 优惠券核销接口（线上核销）
     * @param couponCancellationRequest
     * @return
     */
    NoticeResponseDTO couponcancellationinterface(CouponCancellationRequestDTO couponCancellationRequest);

    /**
     * 核销回调通知接口
     * @param notifyUrl
     * @param writeoffCallbackRequest
     * @return
     */
    NoticeResponseDTO VerificationCallbackNotificationInterface(String notifyUrl,WriteoffCallbackRequestDTO writeoffCallbackRequest);


}
