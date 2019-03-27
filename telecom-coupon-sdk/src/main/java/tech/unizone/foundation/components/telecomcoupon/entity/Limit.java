package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 09:51
 * @Description:  领用限制
 */
public class Limit {

    //每天限制领取次数
    private Integer limitPerDay;

    //最大领取次数
    private Integer maxLimit;

    public Integer getLimitPerDay() {
        return limitPerDay;
    }

    public void setLimitPerDay(Integer limitPerDay) {
        this.limitPerDay = limitPerDay;
    }

    public Integer getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }
}
