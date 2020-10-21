package service;

import entity.History;
import entity.HistoryDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/14 19:51
 */
public interface HistoryService {
    /**
     * 新增历史记录
     * @param history 历史记录
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int insert(History history);

    /**
     * 更新历史记录（通常是更新收藏的视频）
     * @param history 历史记录
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int update(History history);

    /**
     * 删除历史记录（物理删除）
     * @param history 历史记录
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int delete(History history);

    /**
     * 查询历史记录
     * @param history 历史记录
     * @return 历史记录的关联信息、视频信息及发布者的信息
     */
    public HistoryDO queryHistory(History history);

    /**
     * 分页查询所有的历史信息（管理员使用？）
     * @param page 页数
     * @param num 每页可显示的个数
     * @return 历史记录的关联信息、视频信息及发布者的信息
     */
    public List<HistoryDO> queryAllHistoryByPages(int page,int num);

    /**
     *
     * @param history
     * @param page
     * @param num
     * @return
     */
    List<HistoryDO> queryHistoriesByUserPages(History history,int page,int num);
}
