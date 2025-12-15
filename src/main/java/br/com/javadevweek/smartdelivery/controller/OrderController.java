package br.com.javadevweek.smartdelivery.controller;

import br.com.javadevweek.smartdelivery.dto.CreateOrderRequest;
import br.com.javadevweek.smartdelivery.dto.CreateOrderResponse;
import br.com.javadevweek.smartdelivery.service.CreateOrderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
    @Autowired
    private CreateOrderUseCase createOrderUseCase;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateOrderRequest createOrderRequest) {
        var order = createOrderUseCase.execute(createOrderRequest);
        var response = new CreateOrderResponse(order.getId(), order.getStatus());
        return ResponseEntity.ok().body(response);
    }
}
