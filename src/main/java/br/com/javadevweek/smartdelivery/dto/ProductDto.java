package br.com.javadevweek.smartdelivery.dto;

public class ProductDto {
    private final int code;
    private final String name;
    private final String description;
    private final double price;

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
