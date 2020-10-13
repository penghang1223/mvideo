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

    public Permission() {
    }

    public Permission(String permissionName, String url, Integer status) {
        this.permissionName = permissionName;
        this.url = url;
        this.status = status;
    }

    public Permission(Integer id, String permissionName, String url, Integer status) {
        this.id = id;
        this.permissionName = permissionName;
        this.url = url;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
