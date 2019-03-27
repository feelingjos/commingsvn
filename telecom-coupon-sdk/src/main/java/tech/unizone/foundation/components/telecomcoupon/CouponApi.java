package tech.unizone.foundation.components.telecomcoupon;

import cn.hutool.core.bean.BeanUtil;
import tech.unizone.foundation.components.telecomcoupon.req.*;
import tech.unizone.foundation.components.telecomcoupon.resp.*;
import tech.unizone.foundation.components.telecomcoupon.service.TelecomCouponService;
import tech.unizone.foundation.components.telecomcoupon.service.impl.TelecomCouponServiceImpl;
import tech.unizone.foundation.components.telecomcoupon.utils.AuthUtil;
import tech.unizone.foundation.components.telecomcoupon.utils.MapUtils;

import java.util.Map;

/**
 * @Auther: wuhuahao
 * @Date: 2019/2/22 10:36
 * @Description:  优惠券接口api
 */
public class CouponApi {

    private static final TelecomCouponService telecomCouponService = new TelecomCouponServiceImpl();

    /**
     * 领取优惠券
     * @param receiveCouponsRequest
     * @return
     */
    public static ReceiveCouponsResponseDTO receiveCoupons(ReceiveCouponsRequestDTO receiveCouponsRequest){
        //封装参数
        Map<String, Object> map = BeanUtil.beanToMap(receiveCouponsRequest, false, true);

        String sign = receiveCouponsRequest.getSign();

        //设置参数加密处理
        receiveCouponsRequest.setSign(AuthUtil.sign(MapUtils.beanMap(map), sign));

        ReceiveCouponsResponseDTO receiveCouponsResponseDTO = telecomCouponService.receiveCoupons(receiveCouponsRequest);

        return receiveCouponsResponseDTO;
    }


    /**
     * 优惠券领用记录详情
     * @param voucherAcquisitionRecordRequest
     * @return
     */
    public static VoucherAcquisitionRecordResponseDTO preferentialVoucherReceiptRecord(VoucherAcquisitionRecordRequestDTO voucherAcquisitionRecordRequest){
        Map<String, Object> map = BeanUtil.beanToMap(voucherAcquisitionRecordRequest, false, true);

        //sign密钥
        String sign = voucherAcquisitionRecordRequest.getSign();

        voucherAcquisitionRecordRequest.setSign(AuthUtil.sign(MapUtils.beanMap(map), sign));

        VoucherAcquisitionRecordResponseDTO voucherAcquisitionRecordResponseDTO = telecomCouponService.preferentialVoucherReceiptRecord(voucherAcquisitionRecordRequest);

        return voucherAcquisitionRecordResponseDTO;
    }

    /**
     * 查询用户卡包
     * @param viewUserCardPackRequest
     * @return
     */
    public static ViewUserCardPackResponseDTO queryUserCardPack(ViewUserCardPackRequestDTO viewUserCardPackRequest){

        Map<String, Object> map = BeanUtil.beanToMap(viewUserCardPackRequest, false, true);

        //sign密钥
        String sign = viewUserCardPackRequest.getSign();

        viewUserCardPackRequest.setSign(AuthUtil.sign(MapUtils.beanMap(map), sign));

        ViewUserCardPackResponseDTO viewUserCardPackResponseDTO = telecomCouponService.queryUserCardPack(viewUserCardPackRequest);

        return viewUserCardPackResponseDTO;
    }

    /**
     * 优惠券定义信息查询
     * @param couponDefinitionInfoRequest
     * @return
     */
    public static VoucherDefinitionInformationResponseDTO discountDefinitionInformationQuery(CouponDefinitionInfoRequestDTO couponDefinitionInfoRequest){
        Map<String,Object> map= BeanUtil.beanToMap(couponDefinitionInfoRequest,false,true);

        String sign = couponDefinitionInfoRequest.getSign();

        couponDefinitionInfoRequest.setSign(AuthUtil.sign(MapUtils.beanMap(map), sign));

        VoucherDefinitionInformationResponseDTO voucherDefinitionInformationResponseDTO = telecomCouponService.discountDefinitionInformationQuery(couponDefinitionInfoRequest);

        return voucherDefinitionInformationResponseDTO;
    }

    /**
     * 优惠券核销接口（线上核销）
     * @param couponCancellationRequest
     * @return
     */
    public static NoticeResponseDTO couponcancellationinterface(CouponCancellationRequestDTO couponCancellationRequest){
        Map<String,Object> map= BeanUtil.beanToMap(couponCancellationRequest,false,true);

        String sign = couponCancellationRequest.getSign();

        couponCancellationRequest.setSign(AuthUtil.sign(MapUtils.beanMap(map), sign));

        NoticeResponseDTO couponcancellationinterface = telecomCouponService.couponcancellationinterface(couponCancellationRequest);

        return couponcancellationinterface;
    }



}
