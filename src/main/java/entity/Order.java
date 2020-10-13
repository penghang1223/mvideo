package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Schean
 * @Date: 2020/10/12 18:14
 */
public class Order {
    private Long id;
    private Long userId;//订单用户
    private Date orderDate;//订单日期
    private BigDecimal amount;//订单金额
    private String notes;//订单描述

    public Order() {
    }

    public Order(Long userId, Date orderDate, BigDecimal amount, String notes) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.amount = amount;
        this.notes = notes;
    }

    public Order(Long id, Long userId, Date orderDate, BigDecimal amount, String notes) {
        this(userId, orderDate, amount, notes);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderDate=" + orderDate +
                ", amount=" + amount +
                ", notes='" + notes + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
