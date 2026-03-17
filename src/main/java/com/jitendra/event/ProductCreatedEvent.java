package com.jitendra.event;

public class ProductCreatedEvent {

    private Long productId;
    private String name;

    public ProductCreatedEvent() {}

    public ProductCreatedEvent(Long productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
}