package dao.impl;

import dao.BaseDao;
import dao.VideoDao;
import entity.Video;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/13 16:52
 */
public class VideoDaoImpl extends BaseDao implements VideoDao {
    @Override
    public int insert(Video video) {
        String sql = "INSERT INTO Video(id,title,uploaderId,type,desc,coverPic,url) VALUES(?,?,?,?,?,?,?)";
        return update(sql,video.getId(),video.getTitle(),video.getUploaderId(),video.getType(),video.getDesc(),video.getCoverPic(),video.getUrl());
    }

    @Override
    public int update(Video video) {
        String sql = "UPDATE  Video SET Title=?,type=?,desc=?,coverPic=? where id=? OR uploaderId=?";
        return update(sql,video.getTitle(),video.getType(),video.getDesc(),video.getCoverPic(),video.getId(),video.getUploaderId());
    }

    @Override
    public int delete(Video video) {
        String sql = "delete Video WHERE ID=?";
        return update(sql,video.getId());
    }

    @Override
    public Video queryVideoByTitle(String name) {
        String sql = "SELECT * FROM VIDEO WHERE TITLE=?";
        return queryForOne(Video.class,sql,name);
    }

    @Override
    public List<Video> queryAllVideo() {
        String sql = "SELECT * FROM VIDEO";
        return queryForList(Video.class,sql);
    }

    @Override
    public List<Video> queryVideoByPage(int num,int page) {
        String sql = "SELECT * FROM VIDEO LIMIT ?,?";
        return queryForList(Video.class,sql,(page-1)*num,num);
    }
}
