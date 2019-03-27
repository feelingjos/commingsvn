package tech.unizone.foundation.components.telecomcoupon.resp;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 14:15
 * @Description: 领取优惠券返回
 */
public class ReceiveCouponsResponseDTO {

    //结果编码
    private String code;

    //结果说明
    private String msg;

    //领用记录
    private String id;

    //兑换码
    private String giftCode;

    //券名称
    private String name;

    //优惠标题
    private String discount;

    //使用说明
    private String useRule;

    //状态
    private String state;

    //大图
    private String maxImgUrl;

    //小图
    private String minImgUrl;

    //系统流水
    private String extSysValue;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
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

    public String getUseRule() {
        return useRule;
    }

    public void setUseRule(String useRule) {
        this.useRule = useRule;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getExtSysValue() {
        return extSysValue;
    }

    public void setExtSysValue(String extSysValue) {
        this.extSysValue = extSysValue;
    }
}
