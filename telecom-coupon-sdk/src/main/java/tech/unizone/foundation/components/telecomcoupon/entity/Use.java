package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 09:56
 * @Description:  use对象
 */
public class Use {

    //核销方式
    private String hxType;

    //核销范围
    private HxAreas hxAreas;

    //核销限制
    private Targets targets;

    //核销前信息收集
    private CollectInfoBeforeReceive collectInfoBeforeHx;

    public String getHxType() {
        return hxType;
    }

    public void setHxType(String hxType) {
        this.hxType = hxType;
    }

    public HxAreas getHxAreas() {
        return hxAreas;
    }

    public void setHxAreas(HxAreas hxAreas) {
        this.hxAreas = hxAreas;
    }

    public Targets getTargets() {
        return targets;
    }

    public void setTargets(Targets targets) {
        this.targets = targets;
    }

    public CollectInfoBeforeReceive getCollectInfoBeforeHx() {
        return collectInfoBeforeHx;
    }

    public void setCollectInfoBeforeHx(CollectInfoBeforeReceive collectInfoBeforeHx) {
        this.collectInfoBeforeHx = collectInfoBeforeHx;
    }

    @Override
    public String toString() {
        return "Use{" +
                "hxType='" + hxType + '\'' +
                ", hxAreas=" + hxAreas +
                ", targets=" + targets +
                ", collectInfoBeforeHx=" + collectInfoBeforeHx +
                '}';
    }
}
