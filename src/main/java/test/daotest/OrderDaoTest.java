package test.daotest;

import dao.OrderDao;
import dao.impl.OrderDaoImpl;
import entity.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDaoTest {
    OrderDao orderDao = new OrderDaoImpl();

    @Test
    public void testInsert(){
        System.out.println(orderDao.insert(new Order(1L,new Date(),new BigDecimal(10.00),"1")));
    }

    @Test
    public void testQueryById(){
        System.out.println(orderDao.queryById(1));
    }

    @Test
    public void testQueryAll(){
        System.out.println(orderDao.queryAll());
    }
}
