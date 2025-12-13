package br.com.javadevweek.smartdelivery.mapper;

import br.com.javadevweek.smartdelivery.dto.CreateProductRequest;
import br.com.javadevweek.smartdelivery.dto.ProductDto;
import br.com.javadevweek.smartdelivery.entity.Product;

public class ProductMapper {
    public static Product requestToEntity(CreateProductRequest request) {
        return new Product(
                request.getCode(),
                request.getName(),
                request.getDescription(),
                request.getPrice()
        );
    }

    public static ProductDto entityToDto(Product entity) {
        return new ProductDto(
                entity.getCode(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice()
        );
    }
}
