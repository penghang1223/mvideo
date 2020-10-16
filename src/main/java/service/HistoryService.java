package service;

import entity.History;
import entity.HistoryDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/14 19:51
 */
public interface HistoryService {

    public int insert(History history);

    public int update(History history);

    public int delete(History history);

    public HistoryDO queryHistory(History history);

    public List<HistoryDO> queryAllHistory();

    /**
     * 分页查询历史记录【指定的 待更新】
     * @param page
     * @param num
     * @return
     */
    public List<HistoryDO> queryAllHistoryByPages(int page,int num);
}
