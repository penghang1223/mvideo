package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advert {
    private Integer id;
    private String name;//名称
    private String url;//友情链接
    private String coverPic;//广告封面

    public Advert(String name, String url, String coverPic) {
        this.name = name;
        this.url = url;
        this.coverPic = coverPic;
    }

}
