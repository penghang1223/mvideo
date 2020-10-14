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
        String sql = "INSERT INTO VIDEOTYPE(CATEGORY,SECCATEGORY,STATUS) VALUES(?,?,?)";
        return update(sql,videoType.getCategory(),videoType.getSecCategory(),videoType.getStatus());
    }

    @Override
    public int updateType(VideoType videoType) {
        String sql = "UPDATE VIDEOTYPE SET CATEGORY=?,SECCATEGORY=?,STATUS=?";
        return update(sql,videoType.getCategory(),videoType.getSecCategory(),videoType.getStatus());
    }

    @Override
    public int delete(VideoType videoType) {
        String sql = "DELETE VIDEOTYPE WHERE ID=?";
        return update(sql,videoType.getId());
    }

    @Override
    public VideoType queryVideoTypeByCategory(String category) {
        String sql ="SELCET CATEGORY,SECCATEGORY,STATUS FROM VIDEOTYPE WHERE CATEGORY=?";
        return queryForOne(VideoType.class,sql,category);
    }

    @Override
    public List<VideoType> queryAllVideoType(int page, int num) {
        String sql ="SELCET CATEGORY,SECCATEGORY,STATUS FROM VIDEOTYPE LIMIT ?,?";
        return queryForList(VideoType.class,sql,(page-1)*num,num);
    }
}
