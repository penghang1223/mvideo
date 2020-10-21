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
    public List<Video> queryVideoByTitle(String name) {
        String param = "%"+name+"%";
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickname,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  WHERE v.TITLE LIKE  ?;";
        return queryForList(Video.class,sql,param);
    }


    @Override
    public List<Video> queryVideoByUploader(String name) {
        String param = "%"+name+"%";
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickname,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  AND u.nickname=?";
        return queryForList(Video.class,sql,param);
    }

    @Override
    public List<Video> queryVideoByTitleAndType(String title,String type) {
        String param = "%"+title+"%";
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickname,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid = u.id  WHERE v.TITLE LIKE  ? AND v.TYPE= ?;";
        return queryForList(Video.class,sql,param,Integer.valueOf(type));
    }
    @Override
    public  List<Video> queryVideoInOrder(String title,String order){
        String param = "%"+title+"%";
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickname,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  WHERE v.TITLE LIKE  ? ORDER BY` ? DESC;";
        return queryForList(Video.class,sql,param);
    }

    @Override
    public List<Video> queryAllVideo() {
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickname,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id";
        return queryForList(Video.class,sql);
    }

    @Override
    public List<Video> queryAllVideoByPage(int num,int page) {
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickname,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  LIMIT ?,?";
        return queryForList(Video.class,sql,(page-1)*num,num);
    }
}
