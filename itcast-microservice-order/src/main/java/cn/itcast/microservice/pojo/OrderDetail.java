package cn.itcast.microservice.pojo;

/**
 * Created by sunda on 2019/9/20.
 */
public class OrderDetail {

    private String orderId ;			// 订单id
    private Item item ;				// 商品

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderDetail() {
    }

    public OrderDetail(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
}
