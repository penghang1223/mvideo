package dao.impl;

import dao.AdvertDao;
import dao.BaseDao;
import entity.Advert;

import java.util.List;

public class AdvertDaoImpl extends BaseDao implements AdvertDao {
    @Override
    public int insert(Advert advert) {
        String sql = "INSERT INTO `Advert` (`name`, `url`, `coverPic`) VALUES (?, ?, ?);";
        return update(sql, advert.getName(), advert.getUrl(), advert.getCoverPic());
    }

    @Override
    public int updateAdvert(Advert advert) {
        String sql = "UPDATE `Advert` SET `name` = ?, `url` = ?, `coverPic` = ? WHERE `id` = ?;";
        return update(sql, advert.getName(), advert.getUrl(), advert.getCoverPic(), advert.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM `Advert` WHERE `id` = ?;";
        return update(sql, id);
    }

    @Override
    public Advert queryById(Integer id) {
        String sql = "SELECT `id`, `name`, `url`, `coverPic` FROM `Advert` WHERE `id` = ?;";
        return queryForOne(Advert.class, sql, id);
    }

    @Override
    public List<Advert> queryAll() {
        String sql = "SELECT `id`, `name`, `url`, `coverPic` FROM `Advert`;";
        return queryForList(Advert.class, sql);
    }
}
