package service.impl;

import dao.AdvertDao;
import dao.impl.AdvertDaoImpl;
import entity.Advert;
import entity.Page;
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
    public int delete(Long id) {
        return advertDao.delete(id);
    }

    @Override
    public Advert queryAdvertById(Long id) {
        return advertDao.queryAdvertById(id);
    }

    @Override
    public List<Advert> queryAdvertList() {
        return advertDao.queryAdvertList();
    }

    @Override
    public Advert queryAdvertByName(String name) {
        return advertDao.queryAdvertByName(name);
    }


}
