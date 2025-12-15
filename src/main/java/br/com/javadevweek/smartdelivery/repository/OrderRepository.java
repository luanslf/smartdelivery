package br.com.javadevweek.smartdelivery.repository;

import br.com.javadevweek.smartdelivery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
