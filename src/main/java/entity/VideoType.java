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
public class VideoType {
    private Integer id;
    private String category;//一级分类
    private Integer status;//状态：0正常；1删除

    public VideoType(String category) {
        this.category = category;
    }

    public VideoType(Integer id, String category) {
        this.id = id;
        this.category = category;
    }

}
