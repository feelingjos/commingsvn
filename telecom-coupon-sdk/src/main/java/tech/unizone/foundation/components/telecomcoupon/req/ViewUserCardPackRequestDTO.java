package tech.unizone.foundation.components.telecomcoupon.req;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 17:48
 * @Description:  查询用户卡包请求参数
 */
public class ViewUserCardPackRequestDTO {

    //合作系统编码
    private String partner;

    //用户id
    private String userId;

    //用于openId
    private String openId;

    //用户来源
    private String authSource;

    //服务类型
    private String service;

    //时间戳
    private Integer timestamp;

    //签名
    private String sign;

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

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
