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
        return update(sql, video.getTitle(), video.getUploaderId(), video.getType(), new Date(video.getUploadTime().getTime()), video.getDesc(), video.getIsVip(), video.getCoverPic(), 0, video.getUrl(), 1);
    }

    @Override
    public int update(Video video) {
        String sql = "UPDATE  `Video` SET `Title`=?,`type`=?,`uploadTime`=?,`desc`=?,`isVip` = ?,`coverPic`=? ,`url` = ? ,`status` = ? where `id`=?;";
        return update(sql, video.getTitle(), video.getType(), new Date(video.getUploadTime().getTime()), video.getDesc(), video.getIsVip(), video.getCoverPic(), video.getUrl(), video.getStatus(), video.getId());
    }

    @Override
    public int delete(Video video) {
        String sql = "UPDATE VIDEO SET `STATUS` = 3 WHERE ID=?";
        return update(sql, video.getId());
    }

    @Override
    public List<Video> queryVideoByTitle(String name,int begin,int num) {
        String param = "%"+name+"%";
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id AND v.TITLE LIKE  ? ) as t WHERE t.status=0 LIMIT ?,?;";
        return queryForList(Video.class,sql,param,begin,num);
    }


    @Override
    public List<Video> queryVideoByUploader(String name,int begin,int num) {
        String param = "%"+name+"%";
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  AND u.nickName=?) as t WHERE t.status=0 LIMIT ?,?";
        return queryForList(Video.class,sql,param,begin,num);
    }

    @Override
    public List<Video> queryVideoByTitleAndType(String title,String type,int begin,int num) {
        String param = "%"+title+"%";
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid = u.id  WHERE v.TITLE LIKE  ?) as t where t.status=0 AND v.TYPE= ?  LIMIT ?,?;";
        return queryForList(Video.class,sql,param,Integer.valueOf(type),begin,num);
    }

    @Override
    public List<Video> queryAllVideoByPage(int begin,int num) {
        String sql = "SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  LIMIT ?,?";
        return queryForList(Video.class,sql,begin,num);
    }

    @Override
    public  Video queryVideoById(String id) {
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id) as t  WHERE t.id = ?;";
        return queryForOne(Video.class,sql,id);
    }

    @Override
    public Long getCounts(String title) {
        String param  = "%"+title+"%";
        String sql = "SELECT COUNT(*) FROM video WHERE title LIKE ?  and status = 0;";
        return (Long) queryForSingleValue(sql,param);
    }

    @Override
    public List<Video> queryPersonalVideo(Long uploadId) {
        String sql = "SELECT * FROM video WHERE `uploaderid` = ?;";
        return queryForList(Video.class, sql, uploadId);
    }
    @Override
    public List<Video> queryVideoNearXDay(String days,int begin,int pageSize){
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id ) as t WHERE t.status=0 AND  DateDiff(uploadTime,now()) < ? LIMIT ?,?";
        return queryForList(Video.class,sql,days,begin,pageSize);
    }
    @Override
    public List<Video> queryVideoOverthousandviews(int begin,int pageSize){
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id ) as t  WHERE t.viewed >1000  ORDER BY viewed DESC LIMIT ?,?;";
        return queryForList(Video.class,sql,begin,pageSize);
    }

    @Override
    public List<Video> queryVipVideo(int begin,int pageSize){
        String sql = "SELECT * FROM (SELECT v.id,v.TITLE,v.uploaderid,u.nickName,v.type,v.uploadTime,v.desc,v.isVip,v.coverPic,v.viewed,v.url,v.status FROM VIDEO AS v INNER JOIN USER AS u ON v.uploaderid=u.id  ) as t WHERE t.isVip =1 AND t.status = 0  ORDER BY viewed DESC LIMIT ?,?;";
        return queryForList(Video.class,sql,begin,pageSize);
    }
}
