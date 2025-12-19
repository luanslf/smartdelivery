package br.com.javadevweek.smartdelivery.repository;

import br.com.javadevweek.smartdelivery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> { }
