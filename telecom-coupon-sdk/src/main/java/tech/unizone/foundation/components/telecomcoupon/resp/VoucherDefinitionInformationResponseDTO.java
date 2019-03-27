package tech.unizone.foundation.components.telecomcoupon.resp;

import tech.unizone.foundation.components.telecomcoupon.entity.ApplyArea;
import tech.unizone.foundation.components.telecomcoupon.entity.Base;
import tech.unizone.foundation.components.telecomcoupon.entity.Receive;
import tech.unizone.foundation.components.telecomcoupon.entity.Use;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 10:14
 * @Description:  优惠券定义信息查询 返回字段
 */
public class VoucherDefinitionInformationResponseDTO {

    //成功标志
    private String success;

    //失败原因
    private String reason;

    //基本信息
    private Base base;

    //领券配置
    private Receive receive;

    //使用配置
    private Use use;

    //适用范围
    private ApplyArea applyArea;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Receive getReceive() {
        return receive;
    }

    public void setReceive(Receive receive) {
        this.receive = receive;
    }

    public Use getUse() {
        return use;
    }

    public void setUse(Use use) {
        this.use = use;
    }

    public ApplyArea getApplyArea() {
        return applyArea;
    }

    public void setApplyArea(ApplyArea applyArea) {
        this.applyArea = applyArea;
    }

}
