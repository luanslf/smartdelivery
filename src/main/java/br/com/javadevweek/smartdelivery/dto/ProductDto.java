package br.com.javadevweek.smartdelivery.dto;

import java.util.UUID;

public class ProductDto {
    private int code;
    private String name;
    private String description;
    private double price;

    public ProductDto(int code, String name, String description, double price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
