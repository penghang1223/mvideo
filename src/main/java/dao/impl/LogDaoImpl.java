package dao.impl;

import dao.BaseDao;
import dao.LogDao;
import dao.VideoDao;
import entity.Log;
import entity.Video;

import java.util.Date;
import java.util.List;

public class LogDaoImpl extends BaseDao implements LogDao {
    @Override
    public int insert(Log log) {
        String sql = "INSERT INTO log(id,userId,date,ip,url,time,method) VALUES(?,?,?,?,?,?,?)";
        return update(sql,log.getId(),log.getUserId(),log.getDate(),log.getIp(),log.getUrl(),log.getTime(),log.getMethod());
    }
 @Override
    public int delete(Long id) {
     String sql="DELETE FROM `log` WHERE `id`=?";
     return update(sql,id);
    }

    @Override
    public Log queryLogById(Long id) {
        String sql = "SELECT * FROM LOG WHERE ID=?";
        return queryForOne(Log.class,sql,id);
    }

    @Override
    public Log queryLogByUserId(Long userId) {
        String sql = "SELECT * FROM LOG WHERE USERID=?";
        return queryForOne(Log.class,sql,userId);
    }


    @Override
    public Log queryLogByIp(String ip) {
        String sql = "SELECT * FROM LOG WHERE IP=?";
        return queryForOne(Log.class,sql,ip);
    }

    @Override
    public Log queryLogByUrl(String url) {
        String sql = "SELECT * FROM LOG WHERE URL=?";
        return queryForOne(Log.class,sql,url);
    }

    @Override
    public Log queryLogByTime(Float time) {
        String sql = "SELECT * FROM LOG WHERE TIME=?";
        return queryForOne(Log.class,sql,time);
    }

    @Override
    public Log queryLogByMethod(String method) {
        String sql = "SELECT * FROM LOG WHERE METHOD=?";
        return queryForOne(Log.class,sql,method);
    }

    @Override
    public List<Log> queryLogByPage(int num, int page) {
        String sql = "SELECT * FROM LOG LIMIT ?,?";
        return queryForList(Log.class,sql,(page-1)*num,num);
    }

    @Override
    public List<Log> queryAllLog() {
        String sql = "SELECT * FROM LOG";
        return queryForList(Log.class,sql);
    }
}
