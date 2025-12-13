package br.com.javadevweek.smartdelivery.mapper;

import br.com.javadevweek.smartdelivery.dto.CreateCustomerRequest;
import br.com.javadevweek.smartdelivery.entity.Customer;

public class CustomerMapper {
    public static Customer requestToEntity(CreateCustomerRequest request) {
        return new Customer(
                request.getName(),
                request.getPhone(),
                request.getEmail(),
                request.getPassword(),
                request.getZipCode()
        );
    }
}
