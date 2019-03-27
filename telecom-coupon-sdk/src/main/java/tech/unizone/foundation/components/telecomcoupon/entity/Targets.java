package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 09:18
 * @Description: 目标客户
 */
public class Targets {

    //优惠券id
    private String couponId;

    //数据类型
    private String dataType;

    //数据类型名称
    private String nameOfDataType;

    //数据值
    private String dataValue;

    //状态
    private String state;

    //数据值名称
    private String dataValueName;

    //号码开通时间开始值
    private String servOpenStartDate;

    //号码开通时间结束值
    private String servOpenEndDate;

    //销售品竣工时间开始值
    private String offerFinshStartDate;

    //销售品竣工时间结束值
    private String offerFinshEndDate;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getNameOfDataType() {
        return nameOfDataType;
    }

    public void setNameOfDataType(String nameOfDataType) {
        this.nameOfDataType = nameOfDataType;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDataValueName() {
        return dataValueName;
    }

    public void setDataValueName(String dataValueName) {
        this.dataValueName = dataValueName;
    }

    public String getServOpenStartDate() {
        return servOpenStartDate;
    }

    public void setServOpenStartDate(String servOpenStartDate) {
        this.servOpenStartDate = servOpenStartDate;
    }

    public String getServOpenEndDate() {
        return servOpenEndDate;
    }

    public void setServOpenEndDate(String servOpenEndDate) {
        this.servOpenEndDate = servOpenEndDate;
    }

    public String getOfferFinshStartDate() {
        return offerFinshStartDate;
    }

    public void setOfferFinshStartDate(String offerFinshStartDate) {
        this.offerFinshStartDate = offerFinshStartDate;
    }

    public String getOfferFinshEndDate() {
        return offerFinshEndDate;
    }

    public void setOfferFinshEndDate(String offerFinshEndDate) {
        this.offerFinshEndDate = offerFinshEndDate;
    }
}
