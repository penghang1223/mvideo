package test.servicetest;

import entity.Video;
import org.junit.Test;
import service.VideoService;
import service.impl.VideoServiceImpl;
import utils.Page;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/22 11:02
 */
public class VideoServiceTest {
    VideoService videoService = new VideoServiceImpl();
    @Test
    public void pageTest(){
        Page<Video> page = videoService.page("title", "三", 1, 8);
        System.out.println(page.getItems().size());
    }
    @Test
    public void test(){
        List<Video> videos = videoService.queryVideoByValue("title", "三", 1, 8);
        System.out.println(videos);
    }
}
