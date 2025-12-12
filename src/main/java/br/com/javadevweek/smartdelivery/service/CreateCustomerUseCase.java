package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.entity.Customer;
import br.com.javadevweek.smartdelivery.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {
    private CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(Customer customer) {
        var costumerByEmail = customerRepository.findByEmail(customer.getEmail());
        if (costumerByEmail.isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }
        return customerRepository.save(customer);
    }
}