package test.daotest;

import dao.RoleDao;
import dao.impl.RoleDaoImpl;
import entity.Role;
import org.junit.Test;

public class RoleDaoTest {
    RoleDao roleDao = new RoleDaoImpl();

    @Test
    public void testAddRole(){
        System.out.println(roleDao.addRole(new Role("用户","普通用户","1",0)));
    }

    @Test
    public void testUpdateRole(){
        System.out.println(roleDao.updateRole(new Role(2,"VIP","VIP用户","2",1)));
    }

    @Test
    public void testDeleteRole(){
        System.out.println(roleDao.deleteRole(2));
    }

    @Test
    public void testQueryRoleById(){
        System.out.println(roleDao.queryRoleById(2));
    }

    @Test
    public void testQueryAll(){
        System.out.println(roleDao.queryAll());
    }
}
