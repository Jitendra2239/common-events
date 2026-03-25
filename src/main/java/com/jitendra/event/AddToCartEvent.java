package com.jitendra.event;

public class AddToCartEvent {
    private Long userId;
    private String productId;
    private int quantity;

    public AddToCartEvent(Long userId, int quantity, String productId) {
        this.userId = userId;
        this.quantity = quantity;
        this.productId = productId;
    }

    public AddToCartEvent() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}