package com.jitendra.event;


public class OrderPlacedEvent {
    private Long orderId;
    private String customerName;
    private String email;
    private String phone;
    private String address;
    private Double amount;

    public OrderPlacedEvent(Long orderId, Double amount, String address, String phone, String email, String customerName) {
        this.orderId = orderId;
        this.amount = amount;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.customerName = customerName;
    }

    public OrderPlacedEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}