package com.jitendra.event;


public class NotificationEvent {
    private Long userId;
    private String email;
    private String phone;
    private String type;   // ORDER_PLACED, PAYMENT_SUCCESS
    private String message;

    public NotificationEvent(Long userId, String email, String phone, String type, String message) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.type = type;
        this.message = message;
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