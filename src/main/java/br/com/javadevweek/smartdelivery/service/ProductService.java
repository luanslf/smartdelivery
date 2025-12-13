package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.dto.ProductDto;
import br.com.javadevweek.smartdelivery.mapper.ProductMapper;
import br.com.javadevweek.smartdelivery.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> findAll() {
        var products = productRepository.findAll();
        return products.stream().map(ProductMapper::entityToDto).collect(Collectors.toList());
    }
}
