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
    public List<Video> queryVideoByValue(String type, Object value,int num,int page) {
        switch(type){
            case "title":
                if (value instanceof String) {
                    String s = (String) value;
                    return videoDao.queryVideoByTitle(s,num,page);
                }else{
                    try {
                        throw new Exception("对象类型错误");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            case "type":
                if (value instanceof String) {
                    String s = (String) value;
                    String videoType = s.substring(0, s.indexOf("&") - 1);
                    String title = s.substring(s.indexOf("&"));
                    return videoDao.queryVideoByTitleAndType(title,videoType,num,page);
                }else{
                    try {
                        throw new Exception("对象类型错误");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            case "uploader":
                if (value instanceof String) {
                    String s = (String) value;
                    return  videoDao.queryVideoByUploader(s,num,page);
                }else {
                    try {
                        throw new Exception("对象类型错误");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
              //将默认情况添加try、catch
            default:
                return videoDao.queryVideoByTitle((String) value,num,page);
        }
    }
    @Override
    public List<Video> queryVideosByPage(int num, int page) {
        return videoDao.queryAllVideoByPage(num,page);
    }

    @Override
    public Video queryVideoById(String id) {
        return videoDao.queryVideoById(id);
    }

    @Override
    public Long getCounts() {
        return videoDao.getCounts();
    }
}
