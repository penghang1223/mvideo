package test.daotest;

import dao.VideoTypeDao;
import dao.impl.VideoTypeDaoImpl;
import entity.VideoType;
import org.junit.Test;

public class VideoTypeDaoTest {
    VideoTypeDao videoTypeDao = new VideoTypeDaoImpl();

    @Test
    public void testInsert(){
        System.out.println(videoTypeDao.insert(new VideoType("音乐","翻唱",0)));
    }
}
