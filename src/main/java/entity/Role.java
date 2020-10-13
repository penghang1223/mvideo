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

    public Role(String roleName, String desc, String detail, Integer status) {
        this.roleName = roleName;
        this.desc = desc;
        this.detail = detail;
        this.status = status;
    }

}
