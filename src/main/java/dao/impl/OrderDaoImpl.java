package dao.impl;

import dao.BaseDao;
import dao.OrderDao;
import entity.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int insert(Order order) {
        String sql = "INSERT INTO `Order` (`userId`, `orderDate`, `amount`, `notes`) VALUES (?, ?, ?, ?);";
        return update(sql, order.getUserId(), order.getOrderDate(), order.getAmount(), order.getNotes());
    }

    @Override
    public Order queryById(Integer id) {
        String sql = "SELECT `id`, `userId`, `orderDate`, `amount`, `notes` FROM `Order` WHERE `id` = ?;";
        return queryForOne(Order.class, sql, id);
    }

    @Override
    public List<Order> queryAll() {
        String sql = "SELECT `id`, `userId`, `orderDate`, `amount`, `notes` FROM `Order`;";
        return queryForList(Order.class, sql);
    }
}
