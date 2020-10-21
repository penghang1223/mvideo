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
    List<Video> queryVideoByValue(String type, Object value,int num,int page);



    /**
     * 分页查询所有视频
     * @param page 页数
     * @param num 每页可显示的个数
     * @return 视频信息的集合
     */
    List<Video> queryVideosByPage(int num, int page);

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
}
