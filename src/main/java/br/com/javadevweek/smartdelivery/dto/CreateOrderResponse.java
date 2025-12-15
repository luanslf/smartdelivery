package br.com.javadevweek.smartdelivery.dto;

import br.com.javadevweek.smartdelivery.enums.OrderStatus;

import java.util.UUID;

public class CreateOrderResponse {
    private final UUID orderId;
    private final OrderStatus orderStatus;

    public CreateOrderResponse(UUID orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
