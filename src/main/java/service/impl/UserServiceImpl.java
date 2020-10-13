package service.impl;


import dao.UserDao;

import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:18
 */
public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();


    @Override
    public boolean login(User user) {
        if(userDao.queryUserByNicknameAndPassWord(user)==null){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(Long userId) {
        return userDao.delete(userId);
    }

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }

    @Override
    public List<User> queryUserListByPage(int page, int num) {
        return userDao.queryUserListByPage(page,num);
    }

    @Override
    public Long getMaxPage(int num) {
        Long count=userDao.getUserCount();
        long page=count/num;
        if(count%num>0){
            page++;
        }
        return page;
    }

    @Override
    public User queryUserById(Long id) {
        return userDao.queryUserById(id);
    }
    @Override
    public boolean registUser(User user) {
        int result = userDao.insert(user);
        return (result > -1);
    }

    @Override
    public boolean existsUsername(String username) {
        return (userDao.queryUserByNickname(username) == null);
    }
}
