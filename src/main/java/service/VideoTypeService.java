package service;

import entity.VideoType;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/14 19:51
 */
public interface VideoTypeService {

    public int insert(VideoType videoType);


    public int update(VideoType videoType);

    public int delete(VideoType videoType);

    public VideoType queryByCategory(VideoType videoType);

    /**
     * 根据副类型查询视频类别 待更新Dao层方法
     * @param videoType
     * @return
     */
    public VideoType queryBySecCategory(VideoType videoType);

    /**
     * 分页查询视频类型 待更新dao层
     * @param page
     * @param num
     * @return
     */
    public List<VideoType> queryAllVideoTypes(int page,int num);
}
