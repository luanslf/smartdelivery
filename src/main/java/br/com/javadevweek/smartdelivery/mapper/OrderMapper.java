package br.com.javadevweek.smartdelivery.mapper;

import br.com.javadevweek.smartdelivery.dto.CreateOrderRequest;
import br.com.javadevweek.smartdelivery.entity.Order;
import br.com.javadevweek.smartdelivery.entity.Product;

import java.util.UUID;

public class OrderMapper {
    public static Order requestToEntity(CreateOrderRequest request) {
        var order = new Order();
        order.setCustomerId(UUID.fromString(request.getCustomerId()));

        var products = request.getProductIds().stream().map(productId -> {
            var product = new Product();
            product.setId(UUID.fromString(productId));
            return product;
        }).toList();
        order.setProducts(products);

        return order;
    }
}
