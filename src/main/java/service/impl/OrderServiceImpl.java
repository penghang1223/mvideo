package service.impl;

import dao.OrderDao;
import dao.impl.OrderDaoImpl;
import entity.Order;
import service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao = new OrderDaoImpl();

    @Override
    public int insert(Order order) {
        return orderDao.insert(order);
    }

    @Override
    public Order queryById(Integer id) {
        return orderDao.queryById(id);
    }

    @Override
    public List<Order> queryAll() {
        return orderDao.queryAll();
    }
}
