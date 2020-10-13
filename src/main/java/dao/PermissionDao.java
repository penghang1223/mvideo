package dao;

import entity.Permission;

import java.util.List;

public interface PermissionDao {

    /**
     * 添加权限
     * @param permission
     * @return 返回-1代表添加失败
     */
    public int addPermission(Permission permission);

    /**
     * 修改权限
     * @param permission
     * @return 返回-1代表添加失败
     */
    public int updatePermission(Permission permission);

    /**
     * 删除权限
     * @param id
     * @return 返回-1代表添加失败
     */
    public int deletePermission(Integer id);

    /**
     * 通过id查找权限
     * @param id
     * @return Permission对象
     */
    public Permission queryById(Integer id);

    /**
     * 遍历权限信息
     * @return
     */
    public List<Permission> queryAll();

    /**
     * 通过id查找URL
     * @param id
     * @return
     */
    public String queryUrlById(Integer id);
}
