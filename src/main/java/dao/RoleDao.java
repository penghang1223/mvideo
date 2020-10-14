package dao;

import entity.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 添加角色
     * @param role
     * @return 返回-1代表操作失败
     */
    public int insert(Role role);

    /**
     * 修改角色
     * @param role
     * @return 返回-1代表操作失败
     */
    public int updateRole(Role role);

    /**
     * 删除角色
     * @param id
     * @return 返回-1代表操作失败
     */
    public int delete(Integer id);

    /**
     * 通过id查找角色
     * @param id
     * @return 返回Role对象
     */
    public Role queryRoleById(Integer id);

    /**
     * 遍历角色信息
     * @return
     */
    public List<Role> queryAll();
}
