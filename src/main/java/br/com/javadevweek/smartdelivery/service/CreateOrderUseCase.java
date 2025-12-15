package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.dto.CreateOrderRequest;
import br.com.javadevweek.smartdelivery.entity.Order;
import br.com.javadevweek.smartdelivery.mapper.OrderMapper;
import br.com.javadevweek.smartdelivery.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderUseCase {
    private final OrderRepository orderRepository;

    public CreateOrderUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order execute(CreateOrderRequest request) {
        var order = OrderMapper.requestToEntity(request);
        return orderRepository.save(order);
    }
}
