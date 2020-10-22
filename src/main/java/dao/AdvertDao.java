package dao;

import entity.Advert;
import entity.Manager;

import java.util.List;

public interface AdvertDao {
    /**
     * 添加管理员
     * @param advert
     * @return
     */
    int insert(Advert advert);

    /**
     * 修改管理员
     * @param advert
     * @return
     */
    int updateAdvert(Advert advert);

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
    Advert queryAdvertById(Long id);

    /**
     * 遍历管理员
     * @return
     */
    List<Advert> queryAdvertList();

    /**
     * 根据管理员名查询管理员信息
     *
     * @param name 用户名
     * @return 如果null 说明没有这个用户
     */
    public Advert queryAdvertByName(String name);
}
