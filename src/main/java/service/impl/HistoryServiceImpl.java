package service.impl;

import dao.HistoryDao;
import dao.impl.HistoryDaoImpl;
import entity.History;
import entity.HistoryDO;
import entity.Video;
import service.HistoryService;
import utils.Page;

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

    @Override
    public List<HistoryDO> queryHistoriesByUserPages(History history, int page, int num) {
        return historyDao.queryHistoriesByPage(history, page, num);
    }

    @Override
    public Page<HistoryDO> page(History history, int pageNo, int pageSize) {
        Page<HistoryDO> page = new Page<HistoryDO>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = historyDao.getCounts(history.getUserId()).intValue();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        System.out.println("begin:"+begin+" pageTotal:"+pageTotal+" totalcount:"+pageTotalCount);
        // 求当前页数据
        List<HistoryDO> items = queryHistoriesByUserPages(history,begin,pageSize);
        System.out.println(items);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }
}
