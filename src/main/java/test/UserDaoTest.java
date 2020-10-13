package test;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

//    @Test
//    public void queryUserByNickname() {
//        if (userDao.queryUserByNickname("admin1") == null) {
//            System.out.println("用户名可用");
//        } else {
//            System.out.println("用户名已存在");
//        }
//    }

//    @Test
//    public void queryUserByNicknameAndPassWord() {
//        if (userDao.queryUserByNicknameAndPassWord("admin1", "123123") == null) {
//            System.out.println("用户名密码错误，登录失败");
//        } else {
//            System.out.println("登录成功");
//        }
//    }

//    @Test
//    public void insert(){
//        System.out.println(userDao.insert(new User("admin","123123","123456@yahoo.com","110",1,new BigDecimal(10.00),"happy",0)));
//    }
//@Test
//public void update(){
//    System.out.println(userDao.update(new User(new Long(1),"admin1","123123","123456@yahoo.com","110",1,new BigDecimal(10.00),"happy",0)));
//}
//    @Test
//    public void delete(){
//        System.out.println(userDao.delete(new Long(1)));
//    }

//    @Test
//    public void queryUserList() {
//        for (User users :userDao.queryUserList()) {
//            System.out.println(users);
//
//        }
//    }
//    @Test
//    public void queryUserListByPage() {
//        for (User users :userDao.queryUserListByPage(1,2))
//            System.out.println(users);
//    }
//    @Test
//    public void getUserCount() {
//      long a=userDao.getUserCount();
//            System.out.println(a);
//    }
//    @Test
//    public void queryUserById() {
//        System.out.println(userDao.queryUserById(new Long(3)));
//    }
//@Test
//public void queryUserByNicknameAndPassWord() {
//User user=new User("admin4","123123");
//    if (userDao.queryUserByNicknameAndPassWord(user)==null){
//        System.out.println("用户名密码错误，登录失败");
//    } else {
//        System.out.println("登录成功");
//    }
//}
}
