package br.com.javadevweek.smartdelivery.mapper;

import br.com.javadevweek.smartdelivery.dto.CreateCustomerRequest;
import br.com.javadevweek.smartdelivery.dto.CreateUserRequest;
import br.com.javadevweek.smartdelivery.entity.Customer;
import br.com.javadevweek.smartdelivery.enums.UserRole;

import java.util.UUID;

public class CustomerMapper {
    public static Customer requestToEntity(CreateCustomerRequest request, UUID userId) {
        return new Customer(request.phone(), request.zipCode(), userId);
    }

    public static CreateUserRequest customerRequestToUserRequest(CreateCustomerRequest request, UserRole role) {
        return new CreateUserRequest(request.name(), request.email(), request.password(), role);
    }
}
