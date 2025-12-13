package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.dto.CreateProductRequest;
import br.com.javadevweek.smartdelivery.entity.Product;
import br.com.javadevweek.smartdelivery.mapper.ProductMapper;
import br.com.javadevweek.smartdelivery.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateProductUseCase {
    private final ProductRepository productRepository;

    public CreateProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product execute(CreateProductRequest request) {
        var productByCode = productRepository.findByCode(request.getCode());
        if (productByCode.isPresent()) {
            throw new IllegalArgumentException("Product code already exists");
        }
        return productRepository.save(ProductMapper.requestToEntity(request));
    }
}
