package dao;

import entity.RolePermission;

import java.util.List;

public interface RolePermissionDao {
    /**
     * 添加角色权限
     * @param rolePermission
     * @return 返回-1代表添加失败
     */
    public int addRolePermission(RolePermission rolePermission);

    /**
     * 删除角色权限
     * @param id
     * @return 返回-1代表添加失败
     */
    public int deleteRolePermission(Integer id);

    /**
     * 遍历角色权限
     * @return
     */
    public List<RolePermission> queryByRole(Integer roleId);

}
