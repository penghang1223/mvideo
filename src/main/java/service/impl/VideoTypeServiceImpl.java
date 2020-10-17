package service.impl;

import dao.VideoTypeDao;
import dao.impl.VideoTypeDaoImpl;
import entity.VideoType;
import service.VideoTypeService;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/15 21:45
 */
public class VideoTypeServiceImpl implements VideoTypeService {
    VideoTypeDao videoTypeDao = new VideoTypeDaoImpl();
    @Override
    public int insert(VideoType videoType) {
        return videoTypeDao.insert(videoType);
    }

    @Override
    public int update(VideoType videoType) {
        return videoTypeDao.updateType(videoType);
    }

    @Override
    public int delete(VideoType videoType) {
        return videoTypeDao.delete(videoType);
    }

    @Override
    public VideoType queryByCategory(VideoType videoType) {
        return videoTypeDao.queryVideoTypeByCategory(videoType.getCategory());
    }

    @Override
    public VideoType queryBySecCategory(VideoType videoType) {
        return videoTypeDao.queryVideoTypeBySecCategory(videoType.getSecCategory());
    }

    @Override
    public List<VideoType> queryAllVideoTypes(int page, int num) {
        return videoTypeDao.queryAllVideoType(page,num);
    }
}
