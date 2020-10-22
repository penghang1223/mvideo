package service;

import entity.Log;

import java.util.List;

public interface LogService {
    public int delete(Long id);
    /**
     * 通过id查询管理员
     * @param id
     * @return
     */
    Log queryLogById(Long id);

    /**
     * 遍历管理员
     * @return
     */
    List<Log> queryLogList();
    public void deleteAll();
}
