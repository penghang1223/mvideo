package service.impl;

import dao.AdvertDao;
import dao.LogDao;
import dao.impl.AdvertDaoImpl;
import dao.impl.LogDaoImpl;
import entity.Log;
import service.LogService;

import java.util.List;

public class LogServiceImpl implements LogService {
    LogDao logDao = new LogDaoImpl();

    @Override
    public int delete(Long id) {
        return logDao.delete(id);
    }

    @Override
    public Log queryLogById(Long id) {
        return logDao.queryLogById(id);
    }

    @Override
    public List<Log> queryLogList() {
        return logDao.queryLogList();
    }

    @Override
    public void deleteAll() {
        logDao.deleteAll();
    }
}
