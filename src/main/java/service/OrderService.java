package service;

import entity.Order;

import java.util.List;

public interface OrderService {
    /**
     * 添加订单
     * @param order
     * @return
     */
    public int insert(Order order);

    /**
     * 通过订单号查询订单
     * @param id
     * @return
     */
    public Order queryById(Long id);

    /**
     * 遍历订单信息
     * @return
     */
    public List<Order> queryAll();
}
