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
     * @param video 要操作的视频信息
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int insert(Video video);

    /**
     *  更新视频信息
     * @param video 要操作的视频
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int update(Video video);

    /**
     *  删除视频（逻辑删除）
     * @param video 要操作的视频
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int delete(Video video);

    /**
     * 根据不同类别的值查询数据，根据反射实现，待更新方法
     * @param type 属性类型
     * @param value 视频标题
     * @return 被查询到的视频（应改为List）
     */
    public Video queryVideoByValue(String type,Object value);

    /**
     * 查询所有视频
     * @return 视频信息的集合
     */
    public List<Video> queryAllVideos();

    /**
     * 分页查询所有视频
     * @param page 页数
     * @param num 每页可显示的个数
     * @return 视频信息的集合
     */
    public List<Video> queryVideosByPages(int page,int num);
}
