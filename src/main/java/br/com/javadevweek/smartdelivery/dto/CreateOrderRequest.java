package br.com.javadevweek.smartdelivery.dto;

import java.util.List;

public class CreateOrderRequest {
    private String customerId;
    private List<String> productIds;

    public String getCustomerId() {
        return customerId;
    }

    public List<String> getProductIds() {
        return productIds;
    }
}
