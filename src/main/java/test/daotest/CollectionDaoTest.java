package test.daotest;

import dao.CollectionDao;
import dao.impl.CollectionDaoImpl;
import entity.Collection;
import entity.CollectionDO;
import entity.History;
import entity.HistoryDO;
import org.junit.Test;

/**
 * @Author: Schean
 * @Date: 2020/10/20 16:57
 */
public class CollectionDaoTest {
    CollectionDao collectionDao = new CollectionDaoImpl();
    @Test
    public void testQuery(){
        Collection collection = new Collection(1L,3L);
        CollectionDO collectionDO = collectionDao.queryCollection(collection);
        System.out.println(collectionDO);
    }
}
