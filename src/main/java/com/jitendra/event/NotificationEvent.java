package com.jitendra.event;


public class NotificationEvent {
    private Long order_id;
    private Long userId;
    private String email;
    private String phone;
    private String type;   // ORDER_PLACED, PAYMENT_SUCCESS
    private String message;

    public NotificationEvent(Long order_id, String message, String type, String phone, String email, Long userId) {
        this.order_id = order_id;
        this.message = message;
        this.type = type;
        this.phone = phone;
        this.email = email;
        this.userId = userId;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public NotificationEvent() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}