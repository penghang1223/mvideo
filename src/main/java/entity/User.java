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
    private Integer roleId;//角色id
    private BigDecimal wallet;//钱包余额
    private String sign;//个性签名
    private Integer status;//状态：0正常；1封禁

    public User() {
    }

    public User(String nickName, String password, String email, String phone, Integer roleId, BigDecimal wallet, String sign, Integer status) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
        this.wallet = wallet;
        this.sign = sign;
        this.status = status;
    }

    public User(Long id, String nickName, String password, String email, String phone, Integer roleId, BigDecimal wallet, String sign, Integer status) {
        this(nickName, password, email, phone, roleId, wallet, sign, status);
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + roleId +
                ", wallet=" + wallet +
                ", sign='" + sign + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
