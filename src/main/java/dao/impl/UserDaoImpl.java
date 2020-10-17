package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import entity.User;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:17
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByNickname(String nickname) {
        String sql = "SELECT `id`, `nickname`, `password`, `email`, `phone`, `roleId`, `wallet`, `sign`, `status` FROM `user` WHERE `nickname` = ?";
        return queryForOne(User.class, sql, nickname);
    }

    @Override
    public User queryUserByNicknameAndPassWord(String nickname, String password) {
        String sql = "SELECT `id`, `nickname`, `password`, `email`, `phone`, `roleId`, `wallet`, `sign`, `status` FROM `user` WHERE `nickname` = ? AND `password` = ?";
        return queryForOne(User.class, sql, nickname, password);
    }

    @Override
    public int insert(User user) {
        String sql = "INSERT INTO `user` (`nickname`, `password`, `email`, `phone`, `roleId`, `wallet`, `sign`, `status`) VALUES (?, ?, ?,?, ?, ?,?, ?);";
        return update(sql, user.getNickName(),user.getPassword(),user.getEmail(),user.getPhone(),user.getRoleId(),user.getWallet(),user.getSign(),user.getStatus());
    }
    @Override
    public int update(User user) {
        String sql="UPDATE `user` SET `nickname`=?,`password`=?,`email`=?,`phone`=?,`roleId`=?,`wallet`=?,`sign`=?,`status`=? WHERE `id`=?";
        return update(sql,user.getNickName(),user.getPassword(),user.getEmail(),user.getPhone(),user.getRoleId(),user.getWallet(),user.getSign(),user.getStatus(),user.getId());
    }

    @Override
    public int delete(Long id) {
        String sql="UPDATE  `user` SET STATUS=1  WHERE `id`=?";
        return update(sql,id);
    }

    @Override
    public List<User> queryUserList() {
        String sql="SELECT*FROM `user`";
        return queryForList(User.class,sql);
    }
    @Override
    public List<User> queryUserListByPage(int page, int num) {
        String sql="SELECT*FROM `user` LIMIT ?,?";
        return queryForList(User.class,sql,(page-1)*num,num);
    }

    @Override
    public Long getUserCount() {
        String sql="SELECT COUNT(1) FROM `user`";
        return (Long) queryForSingleValue(sql);
    }

    @Override
    public User queryUserById(Long id) {
        String sql="SELECT*FROM `user` WHERE `id`=?";
        return queryForOne(User.class,sql,id);
    }
    @Override
    public User queryUserByNicknameAndPassWord(User user) {
        String sql="SELECT * FROM `user` WHERE `nickname`=? AND `password`=? ";

        return  queryForOne(User.class, sql, user.getNickName(),user.getPassword());
    }

}
