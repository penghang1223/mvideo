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
    int insert(Video video);

    /**
     *  更新视频信息
     * @param video 要操作的视频
     * @return 被影响的行数，返回-1代表添加失败
     */
    int update(Video video);

    /**
     *  删除视频（逻辑删除）
     * @param video 要操作的视频
     * @return 被影响的行数，返回-1代表添加失败
     */
    int delete(Video video);

    Video queryVideoById(String id);
    /**
     * 根据标题查询视频
     * @param name 视频标题
     * @return Video集合
     */
    List<Video> queryVideoByTitle(String name,int num,int begin);

    /**
     *  根据发布者名称查询视频
     * @param name 发布者
     * @return Video集合
     */
    List<Video> queryVideoByUploader(String name,int num,int begin);

    /**
     *  根据标题和类型查询
     * @param title 标题
     * @param type 类型
     * @return 视频集合
     */
    List<Video> queryVideoByTitleAndType(String title,String type,int num,int begin);

    /**
     * 分页查询所有视频
     * @param begin 偏移量
     * @param num 每页可显示的个数
     * @return 视频信息的集合
     */
    List<Video> queryAllVideoByPage(int num,int begin);

    /**
     * 获取记录数
     * @return 总数
     */
    Long getCounts();

    /**
     * 查询个人视频
     * @param uploadId
     * @return
     */
    List<Video> queryPersonalVideo(Long uploadId);

}
