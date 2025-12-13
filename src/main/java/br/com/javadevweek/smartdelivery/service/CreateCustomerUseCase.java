package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.dto.CreateCustomerRequest;
import br.com.javadevweek.smartdelivery.entity.Customer;
import br.com.javadevweek.smartdelivery.mapper.CustomerMapper;
import br.com.javadevweek.smartdelivery.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {
    private final CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(CreateCustomerRequest request) {
        var costumerByEmail = customerRepository.findByEmail(request.getEmail());
        if (costumerByEmail.isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }
        return customerRepository.save(CustomerMapper.requestToEntity(request));
    }
}