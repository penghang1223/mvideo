package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {
    private Integer id;
    private String permissionName;//权限名
    private String url;//资源url
    private Integer status;//状态：0正常；1删除

    public Permission(String permissionName, String url, Integer status) {
        this.permissionName = permissionName;
        this.url = url;
        this.status = status;
    }

}
