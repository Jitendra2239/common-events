package com.jitendra.event;

import java.time.LocalDateTime;
import java.util.List;

public class InventoryFailedEvent {
        private Long orderId;

        private String reason;   // "OUT_OF_STOCK"

        private List<FailedItem> failedItems; // OPTIONAL but powerful

        private Long timestamp;

    public InventoryFailedEvent(Long orderId, Long timestamp, List<FailedItem> failedItems, String reason) {
        this.orderId = orderId;
        this.timestamp = timestamp;
        this.failedItems = failedItems;
        this.reason = reason;
    }

    public InventoryFailedEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public List<FailedItem> getFailedItems() {
        return failedItems;
    }

    public void setFailedItems(List<FailedItem> failedItems) {
        this.failedItems = failedItems;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}