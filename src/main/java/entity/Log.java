package entity;

import java.util.Date;

public class Log {
    private Long id;
    private Long userId;//访问用户
    private Date date;//访问时间
    private String ip;//访问ip
    private String url;//访问资源url
    private Float time;//执行时间
    private String method;//访问方法

    public Log() {
    }

    public Log(Long userId, Date date, String ip, String url, Float time, String method) {
        this.userId = userId;
        this.date = date;
        this.ip = ip;
        this.url = url;
        this.time = time;
        this.method = method;
    }

    public Log(Long id, Long userId, Date date, String ip, String url, Float time, String method) {
        this(userId, date, ip, url, time, method);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", userId=" + userId +
                ", date=" + date +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", time=" + time +
                ", method='" + method + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
