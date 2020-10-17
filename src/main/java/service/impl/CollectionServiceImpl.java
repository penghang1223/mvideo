package service.impl;

import dao.CollectionDao;
import dao.UserDao;
import dao.impl.CollectionDaoImpl;
import dao.impl.UserDaoImpl;
import entity.Collection;
import entity.CollectionDO;
import service.CollectionService;

public class CollectionServiceImpl implements CollectionService {
    CollectionDao collectionDao=new CollectionDaoImpl();
    @Override
    public int insert(Collection collection) {
        return collectionDao.insert(collection);
    }

    @Override
    public int updateCollection(Collection collection) {
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
    public CollectionDO queryCollectionByPage(Collection collection, int page, int num) {
        return collectionDao.queryCollectionByPage(collection, page,num);
    }
}
