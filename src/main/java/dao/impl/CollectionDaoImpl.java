package dao.impl;

import dao.BaseDao;
import dao.CollectionDao;
import entity.Collection;
import entity.CollectionDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:52
 */
public class CollectionDaoImpl extends BaseDao implements CollectionDao {
    @Override
    public int insert(Collection collection) {
        String sql = "INSERT INTO `Collection` (`USERID`,`VIDEOID`) VALUES(?,?)";
        return update(sql,collection.getUserId(),collection.getVideoId());
    }

    @Override
    public int updateCollection(Collection collection) {
        String sql = "UPDATE `COLLECTION` SET `VIDEOID` = ?";
        return update(sql,collection.getVideoId());
    }

    @Override
    public int delete(Collection collection) {
        String sql = "DELETE `COLLECTION` WHERE `USERID`=? AND `VIDEOID` = ?";
        return update(sql,collection.getUserId(),collection.getVideoId());
    }

    @Override
    public CollectionDO queryCollection(Collection collection) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status FROM user as u INNER JOIN Video as v on u.id=v.uploaderId WHERE u.id=? AND v.id=?";
        return queryForOne(CollectionDO.class,sql,collection.getUserId(),collection.getVideoId());
    }

    @Override
    public List<CollectionDO> queryCollectionsByPage(int page, int num) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status FROM user as u INNER JOIN Video as v on u.id=v.uploaderId LIMIT ?,?";
        return queryForList(CollectionDO.class,sql,(page-1)*num,num);
    }
}
