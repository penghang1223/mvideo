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

        Video video = new Video("拯救脱发",1L,"test",1,new Date(),"测试",0,"/image/1.jpg","/testtest.html");
        videoDao.insert(video);
    }

    @Test
    public void testQuery(){
        System.out.println(videoDao.queryVideoByTitle("编程",1,8));
    }

    @Test
    public void testDelete(){
        Video video = new Video();
        video.setId(1L);
        System.out.println(videoDao.delete(video));
    }

    @Test
    public void testPersonal(){
        System.out.println(videoDao.queryPersonalVideo(4L));
    }

    @Test
    public void testQueryById(){
        System.out.println(videoDao.queryVideoById("10"));
    }
}
