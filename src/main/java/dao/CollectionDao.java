package dao;

import entity.Collection;
import entity.CollectionDO;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public interface CollectionDao {
    public int insert(Collection collection);

    public int updateCollection(Collection collection);

    public int delete(Collection collection);

    public CollectionDO queryCollection(Collection collection);

    public CollectionDO queryCollectionByPage(Collection collection,int page,int num);
}
