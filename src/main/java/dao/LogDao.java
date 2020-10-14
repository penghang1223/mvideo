package dao;

import entity.Log;
import entity.Video;

import java.util.Date;
import java.util.List;

public interface LogDao {
    public int insert(Log log);
    public int delete(Long id);
    public Log queryLogById(Long id);
    public Log queryLogByUserId(Long userId);
    public Log queryLogByIp(String ip);
    public Log queryLogByUrl(String url);
    public Log queryLogByTime(Float time);
    public Log queryLogByMethod(String method);
    public List<Log> queryLogByPage(int num, int page);
    public List<Log> queryAllLog();
}
