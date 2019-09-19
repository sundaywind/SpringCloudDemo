package cn.itcast.microservice.service;

import cn.itcast.microservice.pojo.Item;
import cn.itcast.microservice.pojo.Order;
import cn.itcast.microservice.pojo.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by sunda on 2019/9/20.
 */
@Service
public class OrderService {

    private static final Map<String, Order> MAP = new HashMap<String, Order>();

    static {

        // 构造测试数据
        Order order = new Order();
        order.setOrderId("59193738268961441");
        order.setCreateDate(new Date());
        order.setUpdateDate(order.getCreateDate());
        order.setUserId(1L);

        // 创建OrderDetail集合对象
        List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();

        Item item = new Item(); // 此处并没有商品的数据，需要调用商品微服务获取
        item.setId(1L);
        orderDetails.add(new OrderDetail(order.getOrderId(), item));

        item = new Item(); 		// 构造第二个商品数据
        item.setId(2L);
        orderDetails.add(new OrderDetail(order.getOrderId(), item));

        // 将OrderDetail数据集设置给Order对象
        order.setOrderDetails(orderDetails);

        // 将Order对象添加到Map中
        MAP.put(order.getOrderId(), order);
    }

    /**
     * 根据订单id查询订单数据
     *
     * @param orderId
     * @return
     */
    public Order queryOrderById(String orderId) {

        Order order = MAP.get(orderId);

        // 获取Order中的OrderDetail列表数据,然后遍历集合获取每一个OrderDetail,然后调用商品微服务根据商品的id查询商品数据

        return order;
    }

}
