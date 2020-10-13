package dao;

import entity.Video;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 16:50
 */
public interface VideoDao {
    public int insert(Video video);

    public int update(Video video);

    public int delete(Video video);

    public Video queryVideoByTitle(String name);

    public List<Video> queryVideoByPage(int num,int page);

    public List<Video> queryAllVideo();
}
