package dao;

import entity.Collection;
import entity.CollectionDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public interface CollectionDao {
    /**
     *  插入新增收藏信息
     * @param collection 收藏信息
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int insert(Collection collection);

    /**
     * 更新收藏信息
     * @param collection 收藏信息
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int updateCollection(Collection collection);

    /**
     * 删除收藏信息 （物理删除）
     * @param collection 收藏信息
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int delete(Collection collection);

    /**
     * 查询某个特定收藏的信息（视频信息及发布者的一些信息）
     * @param collection 收藏信息
     * @return 返回收藏视频及发布者相关信息
     */
    public CollectionDO queryCollection(Collection collection);

    /**
     * 分页查询所有收藏
     * @param page 页数
     * @param num 每页可显示的个数
     * @return 返回收藏视频及发布者相关信息的集合
     */
    public List<CollectionDO> queryCollections(int page, int num);

    public List<CollectionDO> queryCollectionsByPage(Collection collection,int page, int num);
    public Long getCounts();
}
