package test.daotest;

import dao.RolePermissionDao;
import dao.impl.RolePermissionDaoImpl;
import entity.RolePermission;
import org.junit.Test;

public class RolePermissionDaoTest {
    RolePermissionDao rolePermissionDao = new RolePermissionDaoImpl();

    @Test
    public void testAddRolePermission(){
        System.out.println(rolePermissionDao.addRolePermission(new RolePermission(1,1)));
    }

    @Test
    public void testDeleteRolePermission(){
        System.out.println(rolePermissionDao.deleteRolePermission(2));
    }

    @Test
    public void testQueryByRole(){
        System.out.println(rolePermissionDao.queryByRole(2));
    }
}
