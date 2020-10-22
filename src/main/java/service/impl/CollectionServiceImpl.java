package service.impl;

import dao.CollectionDao;
import dao.impl.CollectionDaoImpl;
import entity.Collection;
import entity.CollectionDO;
import service.CollectionService;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/15 21:45
 */
public class CollectionServiceImpl implements CollectionService {
    CollectionDao collectionDao = new CollectionDaoImpl();
    @Override
    public int insert(Collection collection) {
        return collectionDao.insert(collection);
    }

    @Override
    public int update(Collection collection) {
        return collectionDao.updateCollection(collection);
    }

    @Override
    public int delete(Collection collection) {
        return collectionDao.delete(collection);
    }

    @Override
    public CollectionDO queryCollection(Collection collection) {
        return collectionDao.queryCollection(collection);
    }


    @Override
    public List<CollectionDO> queryCollectionsByPage(int page, int num) {
        return collectionDao.queryCollectionsByPage(page,num);
    }


}
