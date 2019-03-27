package tech.unizone.foundation.components.telecomcoupon.resp;

import java.util.List;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 17:54
 * @Description:  查询用户卡包请求返回内容
 */
public class ViewUserCardPackResponseDTO {

    //结果编码
    private String code;

    //结果说明
    private String msg;

    //用户卡包列表
    private List<Object> coupons;

    //领用id
    private String id;

    //优惠券定义id
    private String couponId;

    //优惠券名称
    private String name;

    //优惠券名称
    private String discount;

    //状态
    private String status;

    //商家背景颜色
    private String mchColor;

    //商家图标地址
    private String mchImgurl;

    //跳转链接
    private String redirectLink;

    //券有效期
    private String valiTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Object> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Object> coupons) {
        this.coupons = coupons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMchColor() {
        return mchColor;
    }

    public void setMchColor(String mchColor) {
        this.mchColor = mchColor;
    }

    public String getMchImgurl() {
        return mchImgurl;
    }

    public void setMchImgurl(String mchImgurl) {
        this.mchImgurl = mchImgurl;
    }

    public String getRedirectLink() {
        return redirectLink;
    }

    public void setRedirectLink(String redirectLink) {
        this.redirectLink = redirectLink;
    }

    public String getValiTime() {
        return valiTime;
    }

    public void setValiTime(String valiTime) {
        this.valiTime = valiTime;
    }

}
