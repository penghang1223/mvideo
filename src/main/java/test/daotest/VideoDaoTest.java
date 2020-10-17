package test.daotest;

import dao.VideoDao;
import dao.impl.VideoDaoImpl;
import entity.Video;
import org.junit.Test;

import java.util.Date;

/**
 * @Author: Schean
 * @Date: 2020/10/16 9:57
 */
public class VideoDaoTest {
    VideoDao videoDao = new VideoDaoImpl();

    @Test
    public void testInsert(){

        Video video = new Video("拯救脱发",1L,1,new Date(),"测试",0,"/image/1.jpg","/testtest.html");
        videoDao.insert(video);
    }

    @Test
    public void testQuery(){
        System.out.println(videoDao.queryVideoByTitle("母猪的产后护理"));
    }

    @Test
    public void testDelete(){
        Video video = new Video();
        video.setId(1L);
        System.out.println(videoDao.delete(video));
    }
}
