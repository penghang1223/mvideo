package dao.impl;

import dao.BaseDao;
import dao.RoleDao;
import entity.Role;

import java.util.List;

public class RoleDaoImpl extends BaseDao implements RoleDao {
    @Override
    public int insert(Role role) {
        String sql = "INSERT INTO `Role` (`roleName`, `desc`, `detail`, `status`) VALUES (?, ?, ?, 0);";
        return update(sql, role.getRoleName(), role.getDesc(), role.getDetail());
    }

    @Override
    public int updateRole(Role role) {
        String sql = "UPDATE `Role` SET `roleName` = ?, `desc` = ?, `detail` = ? WHERE `id` = ?;";
        return update(sql, role.getRoleName(), role.getDesc(), role.getDetail(), role.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "UPDATE `Role` SET `status` = 1 WHERE `id` = ?;";
        return update(sql, id);
    }

    @Override
    public Role queryRoleById(Integer id) {
        String sql = "SELECT `id`, `roleName`, `desc`, `detail`, `status` FROM `Role` WHERE `id` = ?;";
        return queryForOne(Role.class, sql, id);
    }

    @Override
    public List<Role> queryAll() {
        String sql = "SELECT `id`, `roleName`, `desc`, `detail`, `status` FROM `Role` WHERE `status` != 1";
        return queryForList(Role.class, sql);
    }
}
