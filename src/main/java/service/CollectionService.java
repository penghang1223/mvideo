package service;

import entity.Collection;
import entity.CollectionDO;

public interface CollectionService {
    public int insert(Collection collection);

    public int updateCollection(Collection collection);

    public int delete(Collection collection);

    public CollectionDO queryCollection(Collection collection);

    public CollectionDO queryCollectionByPage(Collection collection,int page,int num);
}
