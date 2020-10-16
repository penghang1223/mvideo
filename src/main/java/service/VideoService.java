package service;

import entity.Video;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/14 19:51
 */
public interface VideoService {

    /**
     * 新增视频信息
     * @param video
     * @return
     */
    public int insert(Video video);

    /**
     * 更新视频信息
     * @param video
     * @return
     */
    public int update(Video video);

    /**
     * 根据视频ID删除视频
     * @param video
     * @return
     */
    public int delete(Video video);

    /**
     * 根据不同类别的值查询数据，根据反射实现，待更新方法
     * @param value
     * @return
     */
    public Video queryVideoByValue(Object value);

    /**
     * 查询所有视频
     * @return
     */
    public List<Video> queryAllVideos();

    /**
     * 分页查询视频
     * @param page
     * @param num
     * @return
     */
    public List<Video> queryVideosByPages(int page,int num);
}
