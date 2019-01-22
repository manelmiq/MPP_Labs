package Lab5;

import java.util.*;

public class Order {
    private int orderNo;
    private Calendar orderDate;
    private double orderAmount;


    public Order(int orderNo, Calendar orderDate) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }


    public void setOrderDate(Calendar orderDate){
        this.orderDate = orderDate;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }
}
