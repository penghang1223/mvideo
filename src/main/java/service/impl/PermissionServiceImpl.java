package service.impl;

import dao.PermissionDao;
import dao.impl.PermissionDaoImpl;
import entity.Permission;
import service.PermissionService;

import java.util.List;

public class PermissionServiceImpl implements PermissionService {
    PermissionDao permissionDao = new PermissionDaoImpl();

    @Override
    public int insert(Permission permission) {
        return permissionDao.insert(permission);
    }

    @Override
    public int updatePermission(Permission permission) {
        return permissionDao.updatePermission(permission);
    }

    @Override
    public int delete(Integer id) {
        return permissionDao.delete(id);
    }

    @Override
    public Permission queryById(Integer id) {
        return permissionDao.queryById(id);
    }

    @Override
    public List<Permission> queryAll() {
        return permissionDao.queryAll();
    }
}
