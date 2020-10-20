package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    private Long id;//id
    private String nickName;//昵称
    private String password;//密码
    private String email;//邮箱
    private String phone;//手机号
    private Integer roleId;//角色id

    public Manager(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public Manager(String nickName, String password, String email, String phone, Integer roleId) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
    }
}
