package dao;

import entity.History;
import entity.HistoryDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public interface HistoryDao {
    /**
     *
     * @param history
     * @return
     */
    public int insert(History history);

    /**
     *
     * @param history
     * @return
     */
    public int updateHistory(History history);

    /**
     *
     * @param history
     * @return
     */
    public int delete(History history);

    /**
     *
     * @param history
     * @return
     */
    public HistoryDO queryHistory(History history);

    /**
     *
     * @param history
     * @param page
     * @param num
     * @return
     */
    public List<HistoryDO> queryHistorysByPage(History history, int page, int num);
}
