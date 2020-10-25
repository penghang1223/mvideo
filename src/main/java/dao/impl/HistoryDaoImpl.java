package dao.impl;

import dao.BaseDao;
import dao.HistoryDao;
import entity.History;
import entity.HistoryDO;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/14 9:52
 */
public class HistoryDaoImpl extends BaseDao implements HistoryDao {
    @Override
    public int insert(History history) {
        String sql = "INSERT INTO `HISTORY`(`USERID`,`VIDEOID`) VALUES(?,?)";
        return update(sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public int updateHistory(History history) {
        String sql = "UPDATE `HISTORY` SET `USERID`= ? `VIDEOID`= ?";
        return update(sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public int delete(History history) {
        String sql = "DELETE FROM `HISTORY` WHERE `VIDEOID`= ? AND USERID=?";
        return update(sql,history.getVideoId(),history.getUserId());
    }

    @Override
    public HistoryDO queryHistory(History history) {
        String sql = "SELECT * FROM HISTORY WHERE userid=? AND videoid=?";
        return queryForOne(HistoryDO.class,sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public List<HistoryDO> queryHistoriesByPage(History history, int begin, int num) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status,v.uploaderid,v.id FROM user as u INNER JOIN Video as v on u.id=v.uploaderId WHERE v.id in (SELECT videoid FROM history WHERE userid=?) LIMIT ?,?;";
        return queryForList(HistoryDO.class,sql,history.getUserId(),begin,num);
    }

    @Override
    public List<HistoryDO> queryAllHistoriesByPage(int begin,int num) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status,v.uploaderid,v.id FROM user as u INNER JOIN Video as v on u.id=v.uploaderId  LIMIT ?,?";
        return queryForList(HistoryDO.class,sql,begin,num);
    }

    @Override
    public Long getCounts() {
        String sql = "SELECT COUNT(*) FROM HIStory;";
        return (Long) queryForSingleValue(sql);
    }
}
