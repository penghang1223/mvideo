package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;//id
    private String nickName;//昵称
    private String password;//密码
    private String email;//邮箱
    private String phone;//手机号
    private BigDecimal wallet;//钱包余额
    private String sign;//个性签名
    private Integer status;//状态：0正常；1VIP；2封禁

    public User(String nickName, String password, String email, String phone, BigDecimal wallet, String sign, Integer status) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.wallet = wallet;
        this.sign = sign;
        this.status = status;
    }

    public User(String nickName, String password, String email, String phone, BigDecimal wallet, Integer status) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.wallet = wallet;
        this.status = status;
    }

    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }
}
