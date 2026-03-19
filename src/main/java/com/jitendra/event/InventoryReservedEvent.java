package com.jitendra.event;



public class InventoryReservedEvent {



    private Long orderId;
    private Long userId;

    private Double amount;
    private String currency;

    private String email; // optional (for receipt)
    private String firstName;
    private String lastName;
    private String phone;
    private String status;

    public InventoryReservedEvent(Long orderId, String status, String phone, String lastName, String firstName, String email, String currency, Double amount, Long userId) {
        this.orderId = orderId;
        this.status = status;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.currency = currency;
        this.amount = amount;
        this.userId = userId;
    }

    public InventoryReservedEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}