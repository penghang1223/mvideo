package dao.impl;

import dao.BaseDao;
import dao.PermissionDao;
import entity.Permission;

import java.util.List;

public class PermissionDaoImpl extends BaseDao implements PermissionDao {
    @Override
    public int insert(Permission permission) {
        String sql = "INSERT INTO `Permission` (`permissionName`, `url`, `status`) VALUES (?, ?, ?);";
        return update(sql, permission.getPermissionName(), permission.getUrl(), permission.getStatus());
    }

    @Override
    public int updatePermission(Permission permission) {
        String sql = "UPDATE `Permission` SET `permissionName` = ?, `url` = ? WHERE `id` = ?;";
        return update(sql, permission.getPermissionName(), permission.getUrl(), permission.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "UPDATE `Permission` SET `status` = 1 WHERE `id` = ?;";
        return update(sql, id);
    }

    @Override
    public Permission queryById(Integer id) {
        String sql = "SELECT `id`, `permissionName`, `url`, `status` FROM `Permission` WHERE `id` = ?;";
        return queryForOne(Permission.class, sql, id);
    }

    @Override
    public List<Permission> queryAll() {
        String sql = "SELECT `id`, `permissionName`, `url`, `status` FROM `Permission` WHERE `status` != 1;";
        return queryForList(Permission.class, sql);
    }

    @Override
    public String queryUrlById(Integer id) {
        String sql = "SELECT `url` FROM `Permission` WHERE `id` = ?;";
        return (String) queryForSingleValue(sql, id);
    }
}
