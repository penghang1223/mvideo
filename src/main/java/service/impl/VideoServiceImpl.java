package service.impl;

import dao.VideoDao;
import dao.impl.VideoDaoImpl;
import entity.Video;
import service.VideoService;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/15 21:45
 */
public class VideoServiceImpl  implements VideoService {
    VideoDao videoDao = new VideoDaoImpl();
    @Override
    public int insert(Video video) {
        return videoDao.insert(video);
    }

    @Override
    public int update(Video video) {
        return videoDao.update(video);
    }

    @Override
    public int delete(Video video) {
        return videoDao.delete(video);
    }

    @Override
    public List<Video> queryVideoByValue(String type, Object value) {
        switch(type){
            case "title":
                return videoDao.queryVideoByTitle((String) value);

            case "type":
//                return videoDao.queryVideoByTitleAndType((String) value);
            case "uploader":
                return  videoDao.queryVideoByUploader((String) value);
            default:
                return videoDao.queryVideoByTitle((String) value);
        }
    }

    @Override
    public List<Video> queryAllVideos() {
        return videoDao.queryAllVideo();
    }

    @Override
    public List<Video> queryVideosByPages(int page, int num) {
        return videoDao.queryAllVideoByPage(page,num);
    }
}
