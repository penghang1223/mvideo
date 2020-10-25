package service.impl;

import dao.ManagerDao;
import dao.impl.ManagerDaoImpl;
import entity.Manager;
import service.ManagerService;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    ManagerDao managerDao = new ManagerDaoImpl();

    @Override
    public Manager login(String nickname, String password) {
        return managerDao.queryManagerByNicknameAndPassWord(nickname, password);
    }

    @Override
    public int update(Manager manager) {
        return managerDao.updateManager(manager);
    }

    @Override
    public int delete(Long id) {
        return managerDao.delete(id);
    }

    @Override
    public Manager queryManagerById(Long id) {
        return managerDao.queryManagerById(id);
    }

    @Override
    public List<Manager> queryManagerList(Long id) {
        return managerDao.queryManagerList(id);
    }

    @Override
    public boolean registManager(Manager manager) {
        return managerDao.insert(manager) > -1;
    }

    @Override
    public Manager existsManagername(String nickname) {
        return managerDao.queryManagerByNickname(nickname);
    }
}
