package tech.unizone.foundation.components.telecomcoupon.req;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 14:17
 * @Description:  核销回调通知请求参数
 */
public class WriteoffCallbackRequestDTO {

    //优惠券用户id
    private String userid;

    //优惠券id
    private String coupoId;

    //状态
    private String state;

    //核销门点名称
    private String orgName;

    //核销人名称
    private String checkUserName;

    //核销说明
    private String note;

    //账号
    private String partner;

    //时间戳
    private String timestamp;

    //服务编码
    private String serivce;

    //签名
    private String sign;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCoupoId() {
        return coupoId;
    }

    public void setCoupoId(String coupoId) {
        this.coupoId = coupoId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSerivce() {
        return serivce;
    }

    public void setSerivce(String serivce) {
        this.serivce = serivce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
