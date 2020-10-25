package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Schean
 * @Date: 2020/10/13 21:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionDO {
    private Long uploaderId;//上传者Id
    private Long id;//视频ID
    private String nickName; //上传者昵称
    private String sign;//上传者签名
    private String desc;//视频描述
    private String title;//视频名称
    private int viewed;//视频播放次数
    private  int isVip;//视频是否为VIP视频
    private String coverPic;//封面
    private String url;//链接
    private int status;//视频状态
}
