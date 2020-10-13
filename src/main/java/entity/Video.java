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

}
