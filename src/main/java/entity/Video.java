package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    private Long id;
    private String title;//标题
    private Long uploaderId;//上传者id
    private Integer type;//视频分类
    private Date uploadTime;//上传时间
    private String desc;//视频描述
    private Integer isVip;//视频类型：0 免费；1 VIP
    private String coverPic;//封面图片
    private Integer viewed;//播放量
    private String url;//视频链接
    private Integer status;//状态：0已上传；1待审核；2下架；3删除

    public Video() {
    }

    public Video(String title, Long uploaderId, Integer type, Date uploadTime, String desc, Integer isVip, String coverPic, Integer viewed, String url, Integer status) {
        this.title = title;
        this.uploaderId = uploaderId;
        this.type = type;
        this.uploadTime = uploadTime;
        this.desc = desc;
        this.isVip = isVip;
        this.coverPic = coverPic;
        this.viewed = viewed;
        this.url = url;
        this.status = status;
    }

    public Video(Long id, String title, Long uploaderId, Integer type, Date uploadTime, String desc, Integer isVip, String coverPic, Integer viewed, String url, Integer status) {
        this(title, uploaderId, type, uploadTime, desc, isVip, coverPic, viewed, url, status);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", uploaderId=" + uploaderId +
                ", type=" + type +
                ", uploadTime=" + uploadTime +
                ", desc='" + desc + '\'' +
                ", isVip=" + isVip +
                ", coverPic='" + coverPic + '\'' +
                ", viewed=" + viewed +
                ", url='" + url + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(Long uploaderId) {
        this.uploaderId = uploaderId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public Integer getViewed() {
        return viewed;
    }

    public void setViewed(Integer viewed) {
        this.viewed = viewed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
