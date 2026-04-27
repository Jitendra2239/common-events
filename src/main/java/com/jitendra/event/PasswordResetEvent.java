package com.jitendra.event;


public class PasswordResetEvent {

    private String email;
    private String resetLink;

    public PasswordResetEvent(String email, String resetLink) {
        this.email = email;
        this.resetLink = resetLink;
    }
    public PasswordResetEvent() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResetLink() {
        return resetLink;
    }

    public void setResetLink(String resetLink) {
        this.resetLink = resetLink;
    }
}