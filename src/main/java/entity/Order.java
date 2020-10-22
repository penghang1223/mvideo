package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;//订单用户
    private Date orderDate;//订单日期
    private BigDecimal amount;//订单金额
    private String notes;//订单描述
    private String nickName;//访问方法


    public Order(Long userId, Date orderDate, BigDecimal amount, String notes) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.amount = amount;
        this.notes = notes;
    }

}
