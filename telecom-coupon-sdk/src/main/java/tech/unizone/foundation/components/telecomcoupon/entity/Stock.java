package tech.unizone.foundation.components.telecomcoupon.entity;

/**
 * @Auther: wuhuahao
 * @Date: 2018/12/27 09:48
 * @Description:  库存
 */
public class Stock {

    //库存模式
    private String stockType;

    //库存总数
    private String total;

    //可用总量
    private int num;

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
