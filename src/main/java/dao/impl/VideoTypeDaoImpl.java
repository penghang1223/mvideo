package dao.impl;

import dao.BaseDao;
import dao.VideoTypeDao;
import entity.VideoType;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public class VideoTypeDaoImpl extends BaseDao implements VideoTypeDao {
    @Override
    public int insert(VideoType videoType) {
        String sql = "INSERT INTO `VIDEOTYPE` (`CATEGORY`,`STATUS`)  VALUES (?,0)";
        return update(sql, videoType.getCategory());
    }

    @Override
    public int updateType(VideoType videoType) {
        String sql = "UPDATE `VIDEOTYPE` SET `CATEGORY`=? WHERE `ID`=?";
        return update(sql, videoType.getCategory(), videoType.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "UPDATE `VideoType` SET `STATUS`=1 WHERE `ID`= ?";
        return update(sql, id);
    }

    @Override
    public VideoType queryVideoTypeById(Integer id) {
        String sql = "SELECT * FROM `VideoType` WHERE `id`= ?;";
        return queryForOne(VideoType.class, sql, id);
    }

    @Override
    public List<VideoType> queryAllVideoType() {
        String sql = "SELECT * FROM `VideoType` WHERE `STATUS` != 1;";
        return queryForList(VideoType.class, sql);
    }

}
