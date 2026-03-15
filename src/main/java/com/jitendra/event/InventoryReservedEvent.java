package com.jitendra.event;



public class InventoryReservedEvent {


    private Long orderId;
    private Long productId;

    public InventoryReservedEvent() {
    }

    public InventoryReservedEvent(Long orderId, Long productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}