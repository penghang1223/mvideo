package service.impl;

import dao.RoleDao;
import dao.impl.RoleDaoImpl;
import entity.Role;
import service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    RoleDao roleDao = new RoleDaoImpl();

    @Override
    public int insert(Role role) {
        return roleDao.insert(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    @Override
    public int delete(Integer id) {
        return roleDao.delete(id);
    }

    @Override
    public Role queryRoleById(Integer id) {
        return roleDao.queryRoleById(id);
    }

    @Override
    public List<Role> queryAll() {
        return roleDao.queryAll();
    }
}
