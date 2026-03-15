package com.jitendra.event;



public class OrderCreatedEvent {

    private Long orderId;
    private Long productId;
    private int quantity;

    public OrderCreatedEvent(Long orderId, int quantity, Long productId) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.productId = productId;
    }

    public OrderCreatedEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}