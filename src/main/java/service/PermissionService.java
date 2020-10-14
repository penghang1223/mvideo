package service;

import entity.Permission;

import java.util.List;

public interface PermissionService {
    /**
     * 添加权限
     * @param permission
     * @return 返回-1代表添加失败
     */
    public int insert(Permission permission);

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
    public int delete(Integer id);

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

}
