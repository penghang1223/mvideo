package service;

import entity.Collection;
import entity.CollectionDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/14 19:51
 */
public interface CollectionService {
    /**
     *
     * @param collection
     * @return
     */
    public int insert(Collection collection);

    /**
     *
     * @param collection
     * @return
     */
    public int update(Collection collection);

    /**
     *
     * @param collection
     * @return
     */
    public int delete(Collection collection);

    /**
     *
     * @param collection
     * @return
     */
    public CollectionDO queryCollection(Collection collection);

    /**
     *
     * @param collection
     * @return
     */
    public List<CollectionDO> queryCollections(Collection collection);

    /**
     *
     * @param collection
     * @return
     */
    public List<CollectionDO>queryCollectionsByPage(Collection collection);
}
