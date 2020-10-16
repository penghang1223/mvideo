package dao;

import entity.VideoType;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 20:43
 */
public interface VideoTypeDao {
    /**
     * 新增视频类型
     * @param videoType 视频类型
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int insert(VideoType videoType);

    /**
     * 更新视频类型
     * @param videoType 视频类型
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int updateType(VideoType videoType);

    /**
     *  删除视频类型 （逻辑删除）
     * @param videoType 视频类型
     * @return 被影响的行数，返回-1代表添加失败
     */
    public int delete(VideoType videoType);

    /**
     *  根据一级分类查询
     * @param category 一级分类
     * @return 视频类型
     */
    public VideoType queryVideoTypeByCategory(String category);

    /**
     * 根据二级分类查询
     * @param category 二级分类
     * @return 视频类型
     */
    public VideoType queryVideoTypeBySecCategory(String category);

    /**
     * 查询所有的视频分类
     * @param page 页数
     * @param num 每页可显示的个数
     * @return 视频类型信息的集合
     */
    public List<VideoType> queryAllVideoType(int page,int num);
}
