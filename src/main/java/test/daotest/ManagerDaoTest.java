package test.daotest;

import dao.ManagerDao;
import dao.impl.ManagerDaoImpl;
import entity.Manager;
import org.junit.Test;

public class ManagerDaoTest {
    ManagerDao managerDao = new ManagerDaoImpl();

    @Test
    public void testInsert(){
        System.out.println(managerDao.insert(new Manager("admin","123456","123@qq.com","17606096723",1)));
    }

    @Test
    public void testUpdate(){
        System.out.println(managerDao.updateManager(new Manager(3L,"admin3","123456","111@qq.com","17606096723",1)));
    }

    @Test
    public void testdelete(){
        System.out.println(managerDao.delete(7l));
    }

    @Test
    public void testqueryById(){
        System.out.println(managerDao.queryManagerById(1l));
    }

    @Test
    public void testqueryList(){
        System.out.println(managerDao.queryManagerList(1l));
    }

    @Test
    public void testqueryByName(){
        System.out.println(managerDao.queryManagerByNickname("admin"));
    }

    @Test
    public void testqueryByNameAndPass(){
        System.out.println(managerDao.queryManagerByNicknameAndPassWord("admin2","123456"));
    }

}
