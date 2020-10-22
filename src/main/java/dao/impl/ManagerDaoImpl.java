package dao.impl;

import dao.BaseDao;
import dao.ManagerDao;
import entity.Manager;
import entity.User;

import java.util.List;

public class ManagerDaoImpl extends BaseDao implements ManagerDao {
    @Override
    public int insert(Manager manager) {
        String sql = "INSERT INTO `Manager` (`nickname`, `password`, `email`, `phone`, `roleId`) VALUES (?, ?, ?, ?, ?);";
        return update(sql, manager.getNickName(), manager.getPassword(), manager.getEmail(), manager.getPhone(), manager.getRoleId());
    }

    @Override
    public int updateManager(Manager manager) {
        String sql = "UPDATE `Manager` SET `nickname` = ?, `password` = ?, `email` = ?, `phone` = ?, `roleId` = ? WHERE `id` = ?;";
        return update(sql, manager.getNickName(), manager.getPassword(), manager.getEmail(), manager.getPhone(), manager.getRoleId(), manager.getId());
    }

    @Override
    public int delete(Long id) {
        String sql = "DELETE FROM `Manager` WHERE `id` = ?;";
        return update(sql, id);
    }

    @Override
    public Manager queryManagerById(Long id) {
        String sql = "SELECT * FROM `Manager` WHERE `id` = ?;";
        return queryForOne(Manager.class, sql, id);
    }

    @Override
    public List<Manager> queryManagerList(Long id) {
        String sql = "SELECT `Manager`.id, `nickname`, `roleName`, `password`, `email`, `phone` FROM `Manager`,`Role` WHERE `Manager`.id != ? AND `Manager`.roleId = `Role`.id;";
        return queryForList(Manager.class, sql, id);
    }

    @Override
    public Manager queryManagerByNickname(String nickname) {
        String sql = "SELECT * FROM `Manager` WHERE `nickname` = ?;";
        return queryForOne(Manager.class, sql, nickname);
    }

    @Override
    public Manager queryManagerByNicknameAndPassWord(String nickname, String password) {
        String sql = "SELECT * FROM `Manager` WHERE `nickname` = ? AND `password` = ?;";
        return queryForOne(Manager.class, sql, nickname,password);
    }
}
