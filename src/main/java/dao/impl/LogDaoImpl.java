package dao.impl;

import dao.BaseDao;
import dao.LogDao;
import dao.VideoDao;
import entity.Advert;
import entity.Log;
import entity.Video;

import java.util.Date;
import java.util.List;

public class LogDaoImpl extends BaseDao implements LogDao {

 @Override
    public int delete(Long id) {
     String sql="DELETE FROM `log` WHERE `id`=?";
     return update(sql,id);
    }

    @Override
    public Log queryLogById(Long id) {
        String sql = "SELECT * FROM `log` WHERE `id` = ?";
        return queryForOne(Log.class, sql, id);
    }

    @Override
    public List<Log> queryLogList() {
        String sql = "SELECT `log`.id,date,nickName,ip,url,time,method FROM `log`,`user` WHERE  `log`.userId = `user`.id;";
        return queryForList(Log.class, sql);
    }

    @Override
    public void deleteAll() {
        String sql = "truncate table log;";
        update(sql);
    }
}
