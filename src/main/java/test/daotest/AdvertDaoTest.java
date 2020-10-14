package test.daotest;

import dao.AdvertDao;
import dao.impl.AdvertDaoImpl;
import entity.Advert;
import org.junit.Test;

public class AdvertDaoTest {
    AdvertDao advertDao = new AdvertDaoImpl();

    @Test
    public void testInsert(){
        System.out.println(advertDao.insert(new Advert("百度","www.baidu.com","666")));
    }

    @Test
    public void testUpdate(){
        System.out.println(advertDao.updateAdvert(new Advert(2,"淘宝","www.taobao.com","666")));
    }

    @Test
    public void testDelete(){
        System.out.println(advertDao.delete(1));
    }

    @Test
    public void testQueryById(){
        System.out.println(advertDao.queryById(1));
    }

    @Test
    public void testQueryAll(){
        System.out.println(advertDao.queryAll());
    }
}
