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
    private String secCategory;//二级分类
    private Integer status;//状态：0正常；1删除

    public VideoType(String category, String secCategory, Integer status) {
        this.category = category;
        this.secCategory = secCategory;
        this.status = status;
    }

}
