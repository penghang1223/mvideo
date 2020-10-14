package service;

import entity.Advert;

import java.util.List;

public interface AdvertService {
    /**
     * 添加广告
     * @param advert
     * @return
     */
    public int insert(Advert advert);

    /**
     * 修改广告
     * @param advert
     * @return
     */
    public int updateAdvert(Advert advert);

    /**
     * 删除广告
     * @param id
     * @return
     */
    public int delete(Integer id);

    /**
     * 通过id查询广告
     * @param id
     * @return
     */
    public Advert queryById(Integer id);

    /**
     * 遍历广告信息
     * @return
     */
    public List<Advert> queryAll();
}
