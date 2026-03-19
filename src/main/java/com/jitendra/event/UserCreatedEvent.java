package com.jitendra.event;

import java.util.List;

public class UserCreatedEvent {
    private Long userId;

    private String name;
    private String email;
    private String phone;
    // Default address (flattened)
    private String addressLine;
    private String city;
    private String state;
    private String pincode;

    // Optional roles
    private List<String> roles;

    // Metadata (IMPORTANT)
    private String eventId;
    private Long version;
    private Long timestamp;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(Long userId, Long timestamp, Long version, String eventId, List<String> roles, String pincode, String state, String city, String addressLine, String phone, String email, String name) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.version = version;
        this.eventId = eventId;
        this.roles = roles;
        this.pincode = pincode;
        this.state = state;
        this.city = city;
        this.addressLine = addressLine;
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}