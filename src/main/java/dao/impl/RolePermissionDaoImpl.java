package dao.impl;

import dao.BaseDao;
import dao.RolePermissionDao;
import entity.RolePermission;

import java.util.List;

public class RolePermissionDaoImpl extends BaseDao implements RolePermissionDao {
    @Override
    public int insert(RolePermission rolePermission) {
        String sql = "INSERT INTO `RolePermission` (`roleId`, `permissionId`) VALUES (?, ?);";
        return update(sql, rolePermission.getRoleId(), rolePermission.getPermissionId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM `RolePermission` WHERE `id` = ?;";
        return update(sql, id);
    }

    @Override
    public List<RolePermission> queryByRole(Integer roleId) {
        String sql = "SELECT `id`, `roleId`, `permissionId` FROM `RolePermission` WHERE `roleId` = ?;";
        return queryForList(RolePermission.class, sql, roleId);
    }
}
