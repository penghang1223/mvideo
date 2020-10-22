package test.daotest;

import dao.HistoryDao;
import dao.impl.HistoryDaoImpl;
import entity.History;
import entity.HistoryDO;
import org.junit.Test;

/**
 * @Author: Schean
 * @Date: 2020/10/20 9:40
 */
public class HistoryDaoTest {

    HistoryDao historyDao = new HistoryDaoImpl();
    @Test
    public void testInsert(){
        History history = new History(1L,3L);
        historyDao.insert(history);
    }

    @Test
    public void testQuery(){
        History history = new History(1L,3L);
        HistoryDO historyDO = historyDao.queryHistory(history);
        System.out.println(historyDO);
    }

}
