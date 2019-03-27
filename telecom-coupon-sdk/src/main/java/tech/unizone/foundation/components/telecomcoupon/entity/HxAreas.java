package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 09:59
 * @Description:  核销范围
 */
public class HxAreas {

    //优惠券id
    private String couponId;

    //机构id
    private String orgId;

    //机构名称
    private String orgName;

    //机构父id
    private String orgParentId;

    //机构等级
    private String nodeLevel;

    //地市id
    private String cityId;

    //核销地址
    private String address;

    //子核销范围
    private HxAreas childArea;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(String nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HxAreas getChildArea() {
        return childArea;
    }

    public void setChildArea(HxAreas childArea) {
        this.childArea = childArea;
    }
}
