package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 18:09
 * @Description:  base对象 基本信息
 */
public class Base {

    //券id
    private String couponId;

    //商家名称
    private String mrchName;

    //名称
    private String name;

    //标题
    private String discount;

    //编码
    private String objCode;

    //类型
    private String belongType;

    //大图
    private String maxImgUrl;

    //小图
    private String minImgUrl;

    //使用说明
    private String useRule;

    //生效时间
    private String startTime;

    //失效时间
    private String endTime;

    //状态
    private String state;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getMrchName() {
        return mrchName;
    }

    public void setMrchName(String mrchName) {
        this.mrchName = mrchName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getObjCode() {
        return objCode;
    }

    public void setObjCode(String objCode) {
        this.objCode = objCode;
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType;
    }

    public String getMaxImgUrl() {
        return maxImgUrl;
    }

    public void setMaxImgUrl(String maxImgUrl) {
        this.maxImgUrl = maxImgUrl;
    }

    public String getMinImgUrl() {
        return minImgUrl;
    }

    public void setMinImgUrl(String minImgUrl) {
        this.minImgUrl = minImgUrl;
    }

    public String getUseRule() {
        return useRule;
    }

    public void setUseRule(String useRule) {
        this.useRule = useRule;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Base{" +
                "couponId='" + couponId + '\'' +
                ", mrchName='" + mrchName + '\'' +
                ", name='" + name + '\'' +
                ", discount='" + discount + '\'' +
                ", objCode='" + objCode + '\'' +
                ", belongType='" + belongType + '\'' +
                ", maxImgUrl='" + maxImgUrl + '\'' +
                ", minImgUrl='" + minImgUrl + '\'' +
                ", useRule='" + useRule + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
