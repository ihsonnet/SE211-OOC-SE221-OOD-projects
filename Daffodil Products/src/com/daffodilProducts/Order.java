package com.daffodilProducts;

public class Order {
    final int PRICE = 100;
    private int orderId;
    private int orderedAmount;
    public Order(int orderId, int orderedAmount) {
        this.orderId = orderId;
        this.orderedAmount = orderedAmount;
    }
    public int getOrderId() {
        return orderId;
    }
    public int getOrderedAmount() {
        return orderedAmount;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public void setOrderedAmount(int orderedAmount) {
        this.orderedAmount = orderedAmount;
    }
}
