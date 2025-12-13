package br.com.javadevweek.smartdelivery.repository;

import br.com.javadevweek.smartdelivery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    Optional<Product> findByCode(int code);
}
