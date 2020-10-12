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
    private long userId;
    private String nickName;
    private String password;
    private String email;
    private String phone;
    private Integer role;
    private BigDecimal wallet;
    private String sign;
    private Integer status;
}
