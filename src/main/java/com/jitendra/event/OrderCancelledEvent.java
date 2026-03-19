package com.jitendra.event;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderCancelledEvent {

    private String eventId;
    private Long orderId;
    private Long userId;
    private String reason;
    private LocalDateTime cancelledAt;

    private List<OrderItemDto> items;
    private double totalAmount;

    public OrderCancelledEvent() {
        this.eventId = UUID.randomUUID().toString();
        this.cancelledAt = LocalDateTime.now();
    }

    public OrderCancelledEvent(String eventId, double totalAmount, List<OrderItemDto> items, LocalDateTime cancelledAt, String reason, Long userId, Long orderId) {
        this.eventId = eventId;
        this.totalAmount = totalAmount;
        this.items = items;
        this.cancelledAt = cancelledAt;
        this.reason = reason;
        this.userId = userId;
        this.orderId = orderId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDto> items) {
        this.items = items;
    }

    public LocalDateTime getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(LocalDateTime cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}