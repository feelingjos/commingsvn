package tech.unizone.foundation.components;

import cn.hutool.core.bean.BeanUtil;
import org.junit.Test;
import tech.unizone.foundation.components.telecomcoupon.CouponApi;
import tech.unizone.foundation.components.telecomcoupon.req.*;
import tech.unizone.foundation.components.telecomcoupon.resp.*;
import tech.unizone.foundation.components.telecomcoupon.service.TelecomCouponService;
import tech.unizone.foundation.components.telecomcoupon.service.impl.TelecomCouponServiceImpl;
import tech.unizone.foundation.components.telecomcoupon.utils.AuthUtil;
import tech.unizone.foundation.components.telecomcoupon.utils.MapUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: wuhuahao
 * @Date: 2019/1/22 18:54
 * @Description:
 */
public class TelecomCouponClientTest {

    /**
     *1.2.2	领取优惠券
     * @throws Exception
     */
    @Test
    public void receiveCoupons() throws Exception {

        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");

        ReceiveCouponsRequestDTO receiveCouponsRequest = new ReceiveCouponsRequestDTO();
        receiveCouponsRequest.setPartner("test");
        //receiveCouponsRequest.setPartner("zjdq");
        receiveCouponsRequest.setService("receiveCoupon");
        receiveCouponsRequest.setVersion("v2");
        receiveCouponsRequest.setTimestamp((int) (new Date().getTime() / 1000L));

        receiveCouponsRequest.setAuthSource("1");
        receiveCouponsRequest.setCouponId(21418);
        receiveCouponsRequest.setExtSysType("INDVACT");
        receiveCouponsRequest.setExtSysValue("receiveConpon");
        receiveCouponsRequest.setMobile("18898888238");

        //receiveCouponsRequest.setSign(AuthUtil.sign(maps,"@O4A&B_6"));
        receiveCouponsRequest.setSign("123456");

        ReceiveCouponsResponseDTO receiveCouponsResponseDTO = CouponApi.receiveCoupons(receiveCouponsRequest);

        //无权限
        System.out.println(receiveCouponsResponseDTO.toString());

    }

    /**
     * 1.2.3	优惠券领用记录详情
     */
    @Test
    public void preferentialVoucherReceiptRecord() {

        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");

        VoucherAcquisitionRecordRequestDTO voucherAcquisitionRecordRequest = new VoucherAcquisitionRecordRequestDTO();

        //voucherAcquisitionRecordRequest.setPartner("zjdq");
        voucherAcquisitionRecordRequest.setPartner("test");
        voucherAcquisitionRecordRequest.setService("detail");
        voucherAcquisitionRecordRequest.setTimestamp((int) (new Date().getTime() / 1000L));

        voucherAcquisitionRecordRequest.setOpenId("18319498510");
        voucherAcquisitionRecordRequest.setGetId("2829773");
        voucherAcquisitionRecordRequest.setAuthSource("1");
        voucherAcquisitionRecordRequest.setContentType("json");

        //voucherAcquisitionRecordRequest.setSign(AuthUtil.sign(maps,"@O4A&B_6"));
        voucherAcquisitionRecordRequest.setSign("123456");

        VoucherAcquisitionRecordResponseDTO voucherAcquisitionRecordResponseDTO = CouponApi.preferentialVoucherReceiptRecord(voucherAcquisitionRecordRequest);

        System.out.println(voucherAcquisitionRecordResponseDTO.toString());

    }

    /**
     *1.2.4	查询用户卡包
     */
    @Test
    public void queryUserCardPack() {

        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");

        ViewUserCardPackRequestDTO viewUserCardPackRequest = new ViewUserCardPackRequestDTO();
        //viewUserCardPackRequest.setPartner("zjdq");
        viewUserCardPackRequest.setPartner("test");
        viewUserCardPackRequest.setService("queryUserBag");
        viewUserCardPackRequest.setTimestamp((int) (new Date().getTime() / 1000L));

        viewUserCardPackRequest.setOpenId("123456");

        //viewUserCardPackRequest.setSign(AuthUtil.sign(maps,"@O4A&B_6"));
        viewUserCardPackRequest.setSign("123456");

        ViewUserCardPackResponseDTO viewUserCardPackResponseDTO = CouponApi.queryUserCardPack(viewUserCardPackRequest);

        System.out.println(viewUserCardPackResponseDTO.toString());

    }

    /**
     *1.2.5	优惠券定义信息查询
     */
    @Test
    public void discountDefinitionInformationQuery() {

        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");

        CouponDefinitionInfoRequestDTO couponDefinitionInfoRequest = new CouponDefinitionInfoRequestDTO();
        //couponDefinitionInfoRequest.setPartner("zjdq");
        couponDefinitionInfoRequest.setPartner("test");
        couponDefinitionInfoRequest.setService("qryCoupon");
        couponDefinitionInfoRequest.setTimestamp((int) (new Date().getTime() / 1000L));

        couponDefinitionInfoRequest.setType("1");
        couponDefinitionInfoRequest.setCouponId("21418");

        //couponDefinitionInfoRequest.setSign(AuthUtil.sign(maps,"@O4A&B_6"));
        couponDefinitionInfoRequest.setSign("123456");

        VoucherDefinitionInformationResponseDTO voucherDefinitionInformationResponseDTO = CouponApi.discountDefinitionInformationQuery(couponDefinitionInfoRequest);

        System.out.println(voucherDefinitionInformationResponseDTO.toString());

    }

    /**
     * 1.2.6	核销完成通知接口
     */
    @Test
    public void noticeofCompletionWriteoff() {

        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");

        WriteOffRequestDTO writeOffRequest = new WriteOffRequestDTO();
        //writeOffRequest.setPartner("zjdq");
        writeOffRequest.setPartner("test");
        writeOffRequest.setService("noticeOrder");
        writeOffRequest.setTimestamp((int) (new Date().getTime() / 1000L));
        writeOffRequest.setGetId("2829773");
        writeOffRequest.setOrderNo("orderNo");
        writeOffRequest.setOrderNo("noticeOrder");

        Map<String, Object> map = BeanUtil.beanToMap(writeOffRequest, false, true);

        //writeOffRequest.setSign(AuthUtil.sign(maps,"@O4A&B_6"));
        writeOffRequest.setSign(AuthUtil.sign(MapUtils.beanMap(map), "123456"));

        TelecomCouponService telecomCouponService = new TelecomCouponServiceImpl();
        NoticeResponseDTO noticeResponseDTO = telecomCouponService.noticeofCompletionWriteoff(writeOffRequest);

        System.out.println(noticeResponseDTO.toString());

    }

    /**
     * 1.2.7 优惠券核销接口（线上核销）
     */
    @Test
    public void couponcancellationinterface() {

        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");

        CouponCancellationRequestDTO couponCancellationRequest = new CouponCancellationRequestDTO();
        //couponCancellationRequest.setPartenr("zjdq");
        couponCancellationRequest.setPartner("test");
        couponCancellationRequest.setService("hxVerify");
        couponCancellationRequest.setTimestamp((int) (new Date().getTime() / 1000L));
        couponCancellationRequest.setGetId("2829773");
        //couponCancellationRequest.setSalesId("20150");
        //couponCancellationRequest.setGetId("2829771");
        //couponCancellationRequest.setShortCode("2829773");
        couponCancellationRequest.setMobile("18319498510");

        //couponCancellationRequest.setSign(AuthUtil.sign(maps,"@O4A&B_6"));
        couponCancellationRequest.setSign("123456");

        NoticeResponseDTO couponcancellationinterface = CouponApi.couponcancellationinterface(couponCancellationRequest);

        System.out.println(couponcancellationinterface);


    }

    @Test
    public void test2() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        long oneday = 60 * 60 * 24;
        long date = calendar.getTime().getTime() / 1000 - oneday;
        String s = String.valueOf(date);
        System.out.println(s);

        Date date1 = new Date(date);
        System.out.println(date1);

        long date2 = date + oneday - 1;

        String s1 = String.valueOf(date2);

        System.out.println(s1);

    }


    @Test
    public void testmap(){

        Map<String, Object> maps = new TreeMap<String, Object>(
                new Comparator<String>() {
                    public int compare(String obj1, String obj2) {
                        // 升序排序
                        return obj1.compareTo(obj2);
                    }
                }
        );

        maps.put("b","adf");
        maps.put("bc","adf");
        maps.put("bac","adf");
        maps.put("baa","adf");
        maps.put("a","asdf");

        System.out.println(maps);

    }

    @Test
    public void test5(){

        /*Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        long oneday = 60 * 60 * 24;
        long date = calendar.getTime().getTime() / 1000 - oneday;
        String s = String.valueOf(date);
        System.out.println(s);*/

        String date_1 = "20180910 10:10:10";
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        try {
            System.out.println(String.valueOf(df.parse(date_1).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test6(){

        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
            long oneday=60*60*24;
            long reportEndDate= df.parse("20190102").getTime()/1000+oneday-oneday-1;
            System.out.println(reportEndDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String o = "哦";

        System.out.println(o);

    }

    @Test
    public void test7(){

        /*int now= (int) (new Date().getTime() / 1000L);

        System.out.println(now);

        int sevenDateTime=now - 7 * 60 * 60 * 24;

        System.out.println(sevenDateTime);*/

        Integer reportdateTime=Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format("20191010"));

        System.out.println(reportdateTime);

    }

    @Test
    public void test9(){

        List<String> list=new ArrayList<>();

        list.add("近7天查看7次");
        list.add("近7天查看8次");
        list.add("近7天查看9次");
        list.add("近7天查看20次");
        list.add("近7天查看31次");
        list.add("zxcvvvd");
        list.add("fasewe");
        list.add("先将啊傻傻地方");
        list.add("阿萨斯地方");
        list.add("切问而且");

        //List a = MapUtils.search("近7天查看", list);
    }




}
