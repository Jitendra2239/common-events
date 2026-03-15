package com.jitendra.event;

import java.time.LocalDateTime;

public class InventoryFailedEvent {

    private Long orderId;
    private Long productId;
    private int quantity;
    private String reason;
    private LocalDateTime timestamp;

    public InventoryFailedEvent() {
    }

    public InventoryFailedEvent(Long orderId, Long productId, int quantity, String reason, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}