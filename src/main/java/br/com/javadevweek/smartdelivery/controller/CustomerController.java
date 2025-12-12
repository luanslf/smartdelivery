package br.com.javadevweek.smartdelivery.controller;

import br.com.javadevweek.smartdelivery.entity.Customer;
import br.com.javadevweek.smartdelivery.service.CreateCustomerUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private CreateCustomerUseCase createCustomerUseCase;

    public CustomerController(CreateCustomerUseCase createCustomerUseCase) {
        this.createCustomerUseCase = createCustomerUseCase;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Customer customer) {
        try {
            var costumer = createCustomerUseCase.execute(customer);
            return ResponseEntity.ok().body(costumer);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }
}