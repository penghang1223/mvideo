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
        String sql = "INSERT INTO HISTORY(USERID,VIDEOID) VALUES(?,?)";
        return update(sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public int updateHistory(History history) {
        String sql = "UPDATE HISTORY SET USERID=?,VIDEOID=?";
        return update(sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public int delete(History history) {
        String sql = "DELETE HISTORY WHERE VIDEOID=?";
        return update(sql,history.getVideoId());
    }

    @Override
    public HistoryDO queryHistory(History history) {
        String sql = "SELECT nickName,sign,roleId,TITLE,desc,isVip,coverPic,url,status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id WHERE u.id=? AND v.id=?";
        return queryForOne(HistoryDO.class,sql,history.getUserId(),history.getVideoId());
    }

    @Override
    public List<HistoryDO> queryHistorysByPage(History history, int page, int num) {
        String sql = "SELECT nickName,sign,roleId,TITLE,desc,isVip,coverPic,url,status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id WHERE u.id=? AND v.id=?";
        return queryForList(HistoryDO.class,sql,history.getUserId(),history.getVideoId());
    }
}
