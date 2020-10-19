package dao.impl;

import dao.BaseDao;
import dao.VideoDao;
import entity.Video;

import java.sql.Date;
import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 16:52
 */
public class VideoDaoImpl extends BaseDao implements VideoDao {
    @Override
    public int insert(Video video) {
        String sql = "INSERT INTO `Video` (`title`,`uploaderId`,`type`,`uploadTime`,`desc`,`isVip`,`coverPic`,`viewed`,`url`,`status`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        return update(sql,video.getTitle(),video.getUploaderId(),video.getType(),new Date(video.getUploadTime().getTime()),video.getDesc(),video.getIsVip(),video.getCoverPic(),0,video.getUrl(),1);
    }

    @Override
    public int update(Video video) {
        String sql = "UPDATE  `Video` SET `Title`=?,`type`=?,`uploadTime`=?,`desc`=?,`coverPic`=? where `id`=? OR `uploaderId`=?;";
        return update(sql,video.getTitle(),video.getType(),new Date(video.getUploadTime().getTime()),video.getDesc(),video.getCoverPic(),video.getId(),video.getUploaderId());
    }

    @Override
    public int delete(Video video) {
        String sql = "UPDATE VIDEO SET `STATUS` = 3 WHERE ID=?";
        return update(sql,video.getId());
    }

    @Override
    public Video queryVideoByTitle(String name) {
        String sql = "SELECT `id`, `uploaderid`, `type`, `uploadTime`, `desc`, `isVip`, `coverPic`, `viewed`, `url`, `status` FROM `VIDEO` WHERE `TITLE` LIKE  % ? %;";
        return queryForOne(Video.class,sql,name);
    }

    @Override
    public Video queryVideoByUploader(String name) {
        String sql = "SELECT `id`,`uploaderid`,`type`,`uploadTime`,`desc`,`isVip`,`coverPic`,`viewed`,`url`,`status` FROM VIDEO AS v INNER JOIN USER AS u ON v.`uploaderid`=u.id WHERE u.`name`=?";
        return queryForOne(Video.class,sql,name);
    }

    @Override
    public Video queryVideoByType(String name) {
        String sql = "SELECT `id`, `uploaderid`, `type`, `uploadTime`, `desc`, `isVip`, `coverPic`, `viewed`, `url`, `status` FROM `VIDEO` WHERE `TYPE`= ?;";
        return queryForOne(Video.class,sql,Integer.valueOf(name));
    }

    @Override
    public List<Video> queryAllVideo() {
        String sql = "SELECT `id`,`uploaderid`,`type`,`uploadTime`,`desc`,`isVip`,`coverPic`,`viewed`,`url`,`status` FROM VIDEO";
        return queryForList(Video.class,sql);
    }

    @Override
    public List<Video> queryAllVideoByPage(int num,int page) {
        String sql = "SELECT `id`,`uploaderid`,`type`,`uploadTime`,`desc`,`isVip`,`coverPic`,`viewed`,`url`,`status` FROM VIDEO LIMIT ?,?";
        return queryForList(Video.class,sql,(page-1)*num,num);
    }
}
