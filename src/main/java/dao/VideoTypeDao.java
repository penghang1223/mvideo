package dao;

import entity.VideoType;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public interface VideoTypeDao {
    public int insert(VideoType videoType);

    public int updateType(VideoType videoType);

    public int delete(VideoType videoType);

    public VideoType queryVideoTypeByCategory(String category);

    public List<VideoType> queryAllVideoType(int page,int num);
}
