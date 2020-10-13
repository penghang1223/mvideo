package dao.impl;

import entity.User;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:17
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     *
     * @param nickname 用户名
     * @return 如果null 说明没有这个用户
     */
    public User queryUserByNickname(String nickname);

    /**
     * 根据用户名和密码查询用户信息
     *
     * @param nickname
     * @param password
     * @return 如果返回null 说明用户名或密码错误
     */
    public User queryUserByNicknameAndPassWord(String nickname, String password);

    /**
     * 保存用户信息
     *
     * @param user
     * @return 返回-1表示操作失败
     */
    int insert(User user);
    int update(User user);
    int delete(Long userId);
    List<User> queryUserList();
    /**
     * @param page 当前页数
     * @param num 每一页展示的记录数
     * */
    List<User> queryUserListByPage(int page, int num);
    Long getUserCount();
    User queryUserById(Long id);

    public User queryUserByNicknameAndPassWord(User user);
}
