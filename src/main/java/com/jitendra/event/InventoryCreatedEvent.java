package com.jitendra.event;

public class InventoryCreatedEvent {

    private String productId;
    private String status;

    public InventoryCreatedEvent() {
    }

    public InventoryCreatedEvent(String  productId, String status) {
        this.productId = productId;
        this.status = status;
    }

    public String  getProductId() {
        return productId;
    }

    public void setProductId(String  productId) {
        this.productId = productId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}