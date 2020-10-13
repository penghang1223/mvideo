package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collection {
    private Long id;
    private Long userId;//用户id
    private Long videoId;//视频id

    public Collection(Long userId, Long videoId) {
        this.userId = userId;
        this.videoId = videoId;
    }

}
