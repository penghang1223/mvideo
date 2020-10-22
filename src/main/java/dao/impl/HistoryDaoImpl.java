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
        String sql = "UPDATE `HISTORY` SET `USERID`=?,`VIDEOID`=?";
        return update(sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public int delete(History history) {
        String sql = "DELETE `HISTORY` WHERE `VIDEOID`=?";
        return update(sql,history.getVideoId());
    }

    @Override
    public HistoryDO queryHistory(History history) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status FROM user as u INNER JOIN Video as v on u.id=v.uploaderId WHERE u.id=? OR v.id=?";
        return queryForOne(HistoryDO.class,sql,history.getUserId()==null?0:history.getUserId(),history.getVideoId()==null?0:history.getVideoId());
    }

    @Override
    public List<HistoryDO> queryHistoriesByPage(History history, int page, int num) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status FROM user as u INNER JOIN Video as v on u.id=v.uploaderId WHERE u.id=?  LIMIT ?,?";
        return queryForList(HistoryDO.class,sql,history.getUserId()==null?0:history.getUserId(),(page-1)*num,num);
    }

    @Override
    public List<HistoryDO> queryAllHistoriesByPage(int page,int num) {
        String sql = "SELECT u.nickname,u.sign,v.title,v.desc,v.viewed,v.isVip,v.coverPic,v.url,v.status FROM user as u INNER JOIN Video as v on u.id=v.uploaderId  LIMIT ?,?";
        return queryForList(HistoryDO.class,sql,(page-1)*num,num);
    }
}
