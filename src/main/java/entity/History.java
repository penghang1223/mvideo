package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {
    private Long id;
    private Long userId;//用户id
    private Long videoId;//视频id

    public History(Long userId, Long videoId) {
        this.userId = userId;
        this.videoId = videoId;
    }

}
