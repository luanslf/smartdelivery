package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.dto.CreateCustomerRequest;
import br.com.javadevweek.smartdelivery.entity.Customer;
import br.com.javadevweek.smartdelivery.enums.UserRole;
import br.com.javadevweek.smartdelivery.mapper.CustomerMapper;
import br.com.javadevweek.smartdelivery.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {
    private final CustomerRepository customerRepository;
    private final CreateUserUseCase createUserUseCase;

    public CreateCustomerUseCase(CustomerRepository customerRepository,  CreateUserUseCase createUserUseCase) {
        this.customerRepository = customerRepository;
        this.createUserUseCase = createUserUseCase;
    }

    @Transactional
    public Customer execute(CreateCustomerRequest request) {
        var userRequest = CustomerMapper.customerRequestToUserRequest(request, UserRole.CUSTOMER);
        var user = createUserUseCase.execute(userRequest);
        var customer = CustomerMapper.requestToEntity(request, user.getId());
        return customerRepository.save(customer);
    }
}