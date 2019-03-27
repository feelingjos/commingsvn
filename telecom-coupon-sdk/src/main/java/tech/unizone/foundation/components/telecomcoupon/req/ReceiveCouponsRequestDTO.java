package tech.unizone.foundation.components.telecomcoupon.req;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 12:19
 * @Description: 领取优惠券请求参
 */
public class ReceiveCouponsRequestDTO {

    //合作系统编码
    private String partner;

    //服务类型 def:receiveCoupon
    private String service;

    //版本号 def:v2
    private String version;

    //时间戳
    private Integer timestamp;

    //手机号
    private String mobile;

    /**
     * 用户来源
     * 1、微信
     * 2、单点登录
     * 3、广东天翼
     * 4、支付宝
     * 5、QQ
     * 6、pc端
     * 7、189平台
     */
    private String authSource;

    //优惠券id
    private Integer couponId;

    //姓名
    private String name;

    //证件号码
    private String identiy_card;

    //电子邮箱
    private String email;

    //核销门店id
    private Integer orgId;

    //核销通知url
    private String notifyUrl;

    //参见签名机制
    private String sign;

    //系统标准
    private String extSysType;

    //系统流水
    private String extSysValue;

    //领券渠道
    private String prvId;

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAuthSource() {
        return authSource;
    }

    public void setAuthSource(String authSource) {
        this.authSource = authSource;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentiy_card() {
        return identiy_card;
    }

    public void setIdentiy_card(String identiy_card) {
        this.identiy_card = identiy_card;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExtSysType() {
        return extSysType;
    }

    public void setExtSysType(String extSysType) {
        this.extSysType = extSysType;
    }

    public String getExtSysValue() {
        return extSysValue;
    }

    public void setExtSysValue(String extSysValue) {
        this.extSysValue = extSysValue;
    }

    public String getPrvId() {
        return prvId;
    }

    public void setPrvId(String prvId) {
        this.prvId = prvId;
    }
}
