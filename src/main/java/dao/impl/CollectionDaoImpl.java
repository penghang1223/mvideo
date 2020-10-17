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
        String sql = "SELECT `nickName`,`sign`,`roleId`,`TITLE`,`desc`,`isVip`,`coverPic`,`url`,`status` FROM VIDEO AS v INNER JOIN USER AS u ON v.`uploaderid` = u.`id`";
        return queryForOne(CollectionDO.class,sql,collection.getUserId(),collection.getVideoId());
    }

    @Override
    public List<CollectionDO> queryCollectionsByPage(int page, int num) {
        String sql = "SELECT `nickName`,`sign`,`roleId`,`TITLE`,`desc`,`isVip`,`coverPic`,`url`,`status` FROM VIDEO AS v INNER JOIN USER AS u ON v.`uploaderid` = u.`id` LIMIT ?,?";
        return queryForList(CollectionDO.class,sql,(page-1)*num,num);
    }
}
