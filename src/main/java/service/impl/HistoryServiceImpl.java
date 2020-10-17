package service.impl;

import dao.HistoryDao;
import dao.impl.HistoryDaoImpl;
import entity.History;
import entity.HistoryDO;
import service.HistoryService;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/15 21:46
 */
public class HistoryServiceImpl implements HistoryService {
    HistoryDao historyDao = new HistoryDaoImpl();
    @Override
    public int insert(History history) {
        return historyDao.insert(history);
    }

    @Override
    public int update(History history) {
        return historyDao.updateHistory(history);
    }

    @Override
    public int delete(History history) {
        return historyDao.delete(history);
    }

    @Override
    public HistoryDO queryHistory(History history) {
        return historyDao.queryHistory(history);
    }

    @Override
    public List<HistoryDO> queryAllHistoryByPages(int page, int num) {
        return historyDao.queryAllHistoriesByPage(page, num);
    }
}
