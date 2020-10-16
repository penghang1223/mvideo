package dao;

import entity.Video;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 16:50
 */
public interface VideoDao {
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
     * 根据标题查询视频
     * @param name 视频标题
     * @return 被查询到的视频（应改为List）
     */
    public Video queryVideoByTitle(String name);

    /**
     *  根据发布者名称查询视频
     * @param name 发布者
     * @return 被查询到的视频（应改为List）
     */
    public Video queryVideoByUploader(String name);

    /**
     *  根据类型查询视频
     * @param name 视频类型（Int）
     * @return 被查询到的视频（应改为List）
     */
    public Video queryVideoByType(String name);

    /**
     * 分页查询所有视频
     * @param page 页数
     * @param num 每页可显示的个数
     * @return 视频信息的集合
     */
    public List<Video> queryAllVideoByPage(int num,int page);

    /**
     * 查询所有视频
     * @return 视频信息的集合
     */
    public List<Video> queryAllVideo();
}
