package tech.unizone.foundation.components.telecomcoupon.resp;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 17:42
 * @Description:  优惠券领用记录详情返回数据
 */
public class VoucherAcquisitionRecordResponseDTO {

    //结果编码
    private String code;

    //结果说明
    private String msg;

    //领券记录id
    private String id;

    //卡券名称
    private String name;

    //优惠标题
    private String discount;

    //兑换码
    private String giftCode;

    //使用说明
    private String useRule;

    //状态
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUseRule() {
        return useRule;
    }

    public void setUseRule(String useRule) {
        this.useRule = useRule;
    }

}
