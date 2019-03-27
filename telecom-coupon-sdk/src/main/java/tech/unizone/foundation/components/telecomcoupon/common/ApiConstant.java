package tech.unizone.foundation.components.telecomcoupon.common;

import java.nio.charset.Charset;

public final class ApiConstant {

    //测试环境
    public final static String  API_ENTRY_PRODUCTION = "https://q.189.cn/uniteTouchTest/coupon/gateway.m";

    //生产环境
    //public final static String API_ENTRY_STAGING = "https://q.189.cn/uniteTouch/coupon/gateway.m";
    //public final static String API_ENTRY_STAGING = "https://122.229.31.42:7104/uniteTouchTest/coupon/gateway.m";

    //public final static String API_ENTRY_STAGING = "http://120.78.82.142:2000/telecom/coupon/gateway";
    //public final static String API_ENTRY_STAGING = "https://q.189.cn/uniteTouchTest/coupon/gateway.m";

    public final static String API_ENTRY_STAGING = "http://120.78.82.142:2000/telecomtest/coupon/gateway";
    //public final static String API_ENTRY_STAGING = "http://120.78.82.142:2000/telecom/coupon/gateway";

    //编码格式gbk
    public final static Charset GBK= Charset.forName("GBK");

}
