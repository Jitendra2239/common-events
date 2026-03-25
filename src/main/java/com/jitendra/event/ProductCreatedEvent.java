package com.jitendra.event;

public class ProductCreatedEvent {

    private String productId;
    private String name;

    public ProductCreatedEvent() {}

    public ProductCreatedEvent(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
}