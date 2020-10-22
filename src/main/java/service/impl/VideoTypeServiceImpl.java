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
    public int updateType(VideoType videoType) {
        return videoTypeDao.updateType(videoType);
    }

    @Override
    public int delete(Integer id) {
        return videoTypeDao.delete(id);
    }

    @Override
    public VideoType queryVideoTypeById(Integer id) {
        return videoTypeDao.queryVideoTypeById(id);
    }

    @Override
    public List<VideoType> queryAllVideoType() {
        return videoTypeDao.queryAllVideoType();
    }
}
