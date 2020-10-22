package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    private Long id;
    private Long userId;//访问用户
    private Date date;//访问时间
    private String ip;//访问ip
    private String url;//访问资源url
    private Float time;//执行时间
    private String method;//访问方法
    private String nickName;//访问方法


    public Log(Long userId, Date date, String ip, String url, Float time, String method) {
        this.userId = userId;
        this.date = date;
        this.ip = ip;
        this.url = url;
        this.time = time;
        this.method = method;
    }

}
