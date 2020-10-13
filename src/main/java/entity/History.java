package entity;

public class History {
    private Long id;
    private Long userId;//用户id
    private Long videoId;//视频id

    public History() {
    }

    public History(Long userId, Long videoId) {
        this.userId = userId;
        this.videoId = videoId;
    }

    public History(Long id, Long userId, Long videoId) {
        this(userId, videoId);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", userId=" + userId +
                ", videoId=" + videoId +
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

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}
