package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {
    public Customer execute(Customer customer) {
        System.out.println("Creating customer: " + customer.toString());
        return customer;
    }
}