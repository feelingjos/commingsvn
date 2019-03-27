package tech.unizone.foundation.components.telecomcoupon.req;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 18:04
 * @Description: 优惠券定义信息查询请求参数
 */
public class CouponDefinitionInfoRequestDTO {

    //合作系统编码
    private String partner;

    //服务类型 qryCoupon
    private String service;

    //时间戳
    private Integer timestamp;

    //签名
    private String sign;

    //优惠券
    private String couponId;

    //查询类型
    private String type;

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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
