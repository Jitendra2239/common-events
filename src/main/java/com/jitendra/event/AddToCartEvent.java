package com.jitendra.event;

public class AddToCartEvent {
    private Long userId;
    private Long productId;
    private int quantity;

    public AddToCartEvent(Long userId, int quantity, Long productId) {
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}