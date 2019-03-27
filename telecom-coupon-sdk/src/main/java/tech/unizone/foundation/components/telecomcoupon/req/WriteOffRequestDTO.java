package tech.unizone.foundation.components.telecomcoupon.req;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 10:34
 * @Description:  核销完成通知接口  请求数据
 */
public class WriteOffRequestDTO {

    //合作系统编码
    private String partner;

    //服务类型
    private String service;

    //时间戳
    private Integer timestamp;

    //领用记录id
    private String getId;

    //外系统订单标识
    private String orderNo;

    //通知系统标识
    private String system;

    //签名
    private String sign;

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

    public String getGetId() {
        return getId;
    }

    public void setGetId(String getId) {
        this.getId = getId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
