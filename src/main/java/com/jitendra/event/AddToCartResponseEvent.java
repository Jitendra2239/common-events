package com.jitendra.event;



public class AddToCartResponseEvent {
    private Long userId;
    private Long productId;
    private boolean success;
    private String message;

    private String productName;
    private Double price;
    public AddToCartResponseEvent(Long userId, Long productId, String productName, Double price)
    {
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.price = price;


    }

    public AddToCartResponseEvent() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}