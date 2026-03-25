package com.jitendra.event;

import java.io.Serializable;

public class InventoryCheckEvent implements Serializable {

    private String correlationId; // 🔥 VERY IMPORTANT
    private Long userId;
    private String productId;
    private int quantity;

    public InventoryCheckEvent() {
    }

    public InventoryCheckEvent(String correlationId, Long userId, String productId, int quantity) {
        this.correlationId = correlationId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters & Setters

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String  getProductId() {
        return productId;
    }

    public void setProductId(String  productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}