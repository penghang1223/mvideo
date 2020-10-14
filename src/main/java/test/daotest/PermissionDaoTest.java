package test.daotest;

import dao.PermissionDao;
import dao.impl.PermissionDaoImpl;
import entity.Permission;
import org.junit.Test;

public class PermissionDaoTest {
    PermissionDao permissionDao = new PermissionDaoImpl();

    @Test
    public void testAddPermission(){
        System.out.println(permissionDao.insert(new Permission("修改","pages/update.jsp",0)));
    }

    @Test
    public void testUpdatePermission(){
        System.out.println(permissionDao.updatePermission(new Permission(1,"更新","pages/update.jsp",1)));
    }

    @Test
    public void testDeletePermission(){
        System.out.println(permissionDao.delete(1));
    }

    @Test
    public void testQueryById(){
        System.out.println(permissionDao.queryById(1));
    }

    @Test
    public void testQueryAll(){
        System.out.println(permissionDao.queryAll());
    }

    @Test
    public void testQueryUrlById(){
        System.out.println(permissionDao.queryUrlById(1));
    }
}
