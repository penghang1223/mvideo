package service.impl;

import dao.AdvertDao;
import dao.impl.AdvertDaoImpl;
import entity.Advert;
import service.AdvertService;

import java.util.List;

public class AdvertServiceImpl implements AdvertService {
    AdvertDao advertDao = new AdvertDaoImpl();

    @Override
    public int insert(Advert advert) {
        return advertDao.insert(advert);
    }

    @Override
    public int updateAdvert(Advert advert) {
        return advertDao.updateAdvert(advert);
    }

    @Override
    public int delete(Integer id) {
        return advertDao.delete(id);
    }

    @Override
    public Advert queryById(Integer id) {
        return advertDao.queryById(id);
    }

    @Override
    public List<Advert> queryAll() {
        return advertDao.queryAll();
    }
}
