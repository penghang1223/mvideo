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

    public VideoType() {
    }

    public VideoType(String category, String secCategory) {
        this.category = category;
        this.secCategory = secCategory;
    }

    public VideoType(Integer id, String category, String secCategory) {
        this(category, secCategory);
        this.id = id;
    }

    @Override
    public String toString() {
        return "VideoType{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", secCategory='" + secCategory + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSecCategory() {
        return secCategory;
    }

    public void setSecCategory(String secCategory) {
        this.secCategory = secCategory;
    }
}
