package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer id;
    private String roleName;//角色名
    private String desc;//角色描述
    private String detail;//详情
    private Integer status;//状态：0正常；1删除

    public Role() {
    }

    public Role(String roleName, String desc, String detail, Integer status) {
        this.roleName = roleName;
        this.desc = desc;
        this.detail = detail;
        this.status = status;
    }

    public Role(Integer id, String roleName, String desc, String detail, Integer status) {
        this(roleName, desc, detail, status);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", desc='" + desc + '\'' +
                ", detail='" + detail + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
