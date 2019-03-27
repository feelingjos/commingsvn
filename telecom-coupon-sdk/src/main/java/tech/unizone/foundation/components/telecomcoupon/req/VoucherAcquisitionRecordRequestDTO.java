package tech.unizone.foundation.components.telecomcoupon.req;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 17:37
 * @Description:  优惠券领用记录详情请求参数
 */
public class VoucherAcquisitionRecordRequestDTO {

    //合作系统编号
    private String partner;

    //用户id
    private String userId;

    //用户openId
    private String openId;

    //用户来源
    private String authSource;

    //领用记录
    private String getId;

    //优惠券id
    private String couponId;

    //是否隐藏导航栏
    private String isHiddenNay;

    //服务类型
    private String service;

    //时间戳
    private Integer timestamp;

    //签名
    private String sign;

    //请求类型
    private String contentType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAuthSource() {
        return authSource;
    }

    public void setAuthSource(String authSource) {
        this.authSource = authSource;
    }

    public String getGetId() {
        return getId;
    }

    public void setGetId(String getId) {
        this.getId = getId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getIsHiddenNay() {
        return isHiddenNay;
    }

    public void setIsHiddenNay(String isHiddenNay) {
        this.isHiddenNay = isHiddenNay;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
