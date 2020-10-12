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
    private Integer id;
    private String title;
    private String uploader;
    private String category;
    private String url;
    private String coverPic;
}
