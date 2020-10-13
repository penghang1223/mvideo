package dao;

import entity.Collection;
import entity.CollectionDO;
import entity.History;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public interface HistoryDao {
    public int insert(Collection collection);

    public int updateCollection(Collection collection);

    public int delete(Collection collection);

    public History queryCollection(Collection collection);

    public History queryCollectionByPage(Collection collection, int page, int num);
}
