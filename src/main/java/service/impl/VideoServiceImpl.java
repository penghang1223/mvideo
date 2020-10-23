package service.impl;

import dao.VideoDao;
import dao.impl.VideoDaoImpl;
import entity.Video;
import service.VideoService;
import utils.Page;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/15 21:45
 */
public class VideoServiceImpl implements VideoService {
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
    public List<Video> queryVideoByValue(String type, Object value,int num,int begin) {
        switch(type){
            case "title":
                if (value instanceof String) {
                    String s = (String) value;
                    return videoDao.queryVideoByTitle(s,num,begin);
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
                    return videoDao.queryVideoByTitleAndType(title,videoType,num,begin);
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
                    return  videoDao.queryVideoByUploader(s,num,begin);
                }else {
                    try {
                        throw new Exception("对象类型错误");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
              //将默认情况添加try、catch
            default:
                return videoDao.queryVideoByTitle((String) value,num,begin);
        }
    }

    @Override
    public Video queryVideoById(String id) {
        return videoDao.queryVideoById(id);
    }

    @Override
    public Long getCounts() {
        return videoDao.getCounts();
    }

    @Override
    public Page<Video> page(String type, Object value,int pageNo, int pageSize) {
        Page<Video> page = new Page<Video>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = videoDao.getCounts().intValue();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        System.out.println("begin:"+begin+" pageTotal:"+pageTotal+" totalcount:"+pageTotalCount);
        // 求当前页数据
        List<Video> items = queryVideoByValue(type,value,begin,pageSize);
        System.out.println("type"+type+" value:"+value);
        System.out.println(items);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }

    @Override
    public List<Video> queryPersonalVideo(Long uploadId) {
        return videoDao.queryPersonalVideo(uploadId);
    }
}
