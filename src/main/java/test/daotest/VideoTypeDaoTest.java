package test.daotest;

import dao.VideoTypeDao;
import dao.impl.VideoTypeDaoImpl;
import entity.VideoType;
import org.junit.Test;

public class VideoTypeDaoTest {
    VideoTypeDao videoTypeDao = new VideoTypeDaoImpl();

        @Test
    public void testInsert(){
        System.out.println(videoTypeDao.insert(new VideoType("12345")));
    }

    @Test
    public void testqueryAll() {
        System.out.println(videoTypeDao.queryAllVideoType());
    }

    @Test
    public void testqueryById() {
        System.out.println(videoTypeDao.queryVideoTypeById(2));
    }
}
