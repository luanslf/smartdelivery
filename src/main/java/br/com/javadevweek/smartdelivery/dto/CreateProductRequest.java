package br.com.javadevweek.smartdelivery.dto;

public class CreateProductRequest {
    private int code;
    private String name;
    private String description;
    private double price;

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
