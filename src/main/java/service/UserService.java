package service;

import entity.User;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:18
 */
public interface UserService {
    User login(User user);

    int insert(User user);

    int update(User user);

    int delete(Long userId);

    List<User> queryUserList();

    /**
     * @param page 当前页数
     * @param num  每一页展示的记录数
     */
    List<User> queryUserListByPage(int page, int num);

    Long getMaxPage(int num);

    User queryUserById(Long id);

    /**
     * 注册用户
     *
     * @param user
     */
    public boolean registUser(User user);


    /**
     * 检查用户名是否可用
     *
     * @param username
     * @return 返回true 代表用户名可用
     */
    public boolean existsUsername(String username);

    public List<User> queryManagerList(Long id);
}
