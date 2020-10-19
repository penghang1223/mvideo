package dao;

import entity.Manager;
import entity.User;

import java.util.List;

public interface ManagerDao {
    /**
     * 添加管理员
     * @param manager
     * @return
     */
    int insert(Manager manager);

    /**
     * 修改管理员
     * @param manager
     * @return
     */
    int updateManager(Manager manager);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    int delete (Long id);

    /**
     * 通过id查询管理员
     * @param id
     * @return
     */
    Manager queryManagerById(Long id);

    /**
     * 遍历管理员
     * @return
     */
    List<Manager> queryManagerList(Long id);

    /**
     * 根据管理员名查询管理员信息
     *
     * @param nickname 用户名
     * @return 如果null 说明没有这个用户
     */
    public Manager queryManagerByNickname(String nickname);

    /**
     * 根据管理员名和密码查询管理员信息
     *
     * @param nickname
     * @param password
     * @return 如果返回null 说明用户名或密码错误
     */
    public Manager queryManagerByNicknameAndPassWord(String nickname, String password);
}
