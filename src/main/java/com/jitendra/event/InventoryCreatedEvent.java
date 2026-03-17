package com.jitendra.event;

public class InventoryCreatedEvent {

    private Long productId;
    private String status;

    public InventoryCreatedEvent() {
    }

    public InventoryCreatedEvent(Long  productId, String status) {
        this.productId = productId;
        this.status = status;
    }

    public Long  getProductId() {
        return productId;
    }

    public void setProductId(Long  productId) {
        this.productId = productId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}