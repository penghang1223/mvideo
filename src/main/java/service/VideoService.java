package service;

import entity.Video;
import utils.Page;

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

    /**
     * 根据不同类别的值查询数据，根据反射实现，待更新方法
     * @param type 属性类型
     * @param value 视频标题
     * @return 被查询到的视频（应改为List）
     */
    List<Video> queryVideoByValue(String type, Object value,int num,int begin);


    /**
     * 查询特定的视频（跳转到视频页时使用）
     * @param id 视频Id
     * @return 视频
     */
    Video queryVideoById(String id);
    /**
     * 获取表中的条数
     * @return 获取表中的条数
     */
    Long getCounts();

    Page<Video> page(String type, Object value,int pageNo, int pageSize);

    /**
     * 查询个人视频
     * @param uploadId
     * @return
     */
    List<Video> queryPersonalVideo(Long uploadId);

    /**
     *
     * @param days
     * @param begin
     * @param pageSize
     * @return
     */
    Page<Video> queryVideoNearXDay(String days, int begin, int pageSize);

    /**
     * 查询播放次数大于1000的视频
     * @param begin
     * @param pageSize
     * @return
     */
    Page<Video> queryVideoOverthousandviews(int begin, int pageSize);

    public Page<Video> queryVipVideo(int pageNo,int pageSize);

    /**
     * 查询管理员视频视频
     * @param
     * @return
     */
    List<Video> queryManagerVideo();

    /**
     * 查询用户上传视频
     * @param
     * @return
     */
    List<Video> queryUserVideo();

    /**
     * 查询待审核视频
     * @param
     * @return
     */
    List<Video> queryReviewVideo();
}
