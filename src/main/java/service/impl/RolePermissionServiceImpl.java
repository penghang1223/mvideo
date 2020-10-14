package service.impl;

import dao.RolePermissionDao;
import dao.impl.RolePermissionDaoImpl;
import entity.RolePermission;
import service.RolePermissionService;

import java.util.List;

public class RolePermissionServiceImpl implements RolePermissionService {
    RolePermissionDao rolePermissionDao = new RolePermissionDaoImpl();

    @Override
    public int insert(RolePermission rolePermission) {
        return rolePermissionDao.insert(rolePermission);
    }

    @Override
    public int delete(Integer id) {
        return rolePermissionDao.delete(id);
    }

    @Override
    public List<RolePermission> queryByRole(Integer roleId) {
        return rolePermissionDao.queryByRole(roleId);
    }
}
