package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/26 18:16
 * @Description: Receive对象定义
 */
public class Receive {

    //目标客户
    private Targets targets;

    //库存
    private Stock stock;

    //领取限制
    private Limit limit;

    //领用前信息收集
    private CollectInfoBeforeReceive collectInfoBeforeReceive;

    public Targets getTargets() {
        return targets;
    }

    public void setTargets(Targets targets) {
        this.targets = targets;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    public CollectInfoBeforeReceive getCollectInfoBeforeReceive() {
        return collectInfoBeforeReceive;
    }

    public void setCollectInfoBeforeReceive(CollectInfoBeforeReceive collectInfoBeforeReceive) {
        this.collectInfoBeforeReceive = collectInfoBeforeReceive;
    }

    @Override
    public String toString() {
        return "Receive{" +
                "targets=" + targets +
                ", stock=" + stock +
                ", limit=" + limit +
                ", collectInfoBeforeReceive=" + collectInfoBeforeReceive +
                '}';
    }
}
