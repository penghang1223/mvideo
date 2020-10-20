package service;

import entity.Manager;

import java.util.List;

public interface ManagerService {
    /**
     * 登录
     * @param nickname
     * @return
     */
    Manager login(String nickname, String password);

    /**
     * 更新
     * @param manager
     * @return
     */
    int update(Manager manager);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 通过id查找管理员
     * @param id
     * @return
     */
    Manager queryManagerById(Long id);

    /**
     * 遍历管理员
     * @param id
     * @return
     */
    List<Manager> queryManagerList(Long id);

    /**
     * 注册管理员
     *
     * @param manager
     */
    public boolean registManager(Manager manager);


    /**
     * 检查用户名是否可用
     *
     * @param nickname
     * @return 返回true 代表用户名可用
     */
    public boolean existsManagername(String nickname);
}
