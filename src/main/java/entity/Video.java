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
    private Long videoId;
    private String title;
    private Long uploader;
    private Integer type;
    private Date updateTime;
    private String desc;
    private Integer isVip;
    private String coverPic;
    private Integer viewed;
    private String url;
    private Integer status;
}
