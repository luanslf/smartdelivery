package br.com.javadevweek.smartdelivery.controller;

import br.com.javadevweek.smartdelivery.dto.CreateProductRequest;
import br.com.javadevweek.smartdelivery.dto.ProductDto;
import br.com.javadevweek.smartdelivery.service.CreateProductUseCase;
import br.com.javadevweek.smartdelivery.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    private final CreateProductUseCase createProductUseCase;
    private final ProductService productService;

    public ProductController(CreateProductUseCase createProductUseCase,  ProductService productService) {
        this.createProductUseCase = createProductUseCase;
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll() {
        var products = productService.findAll();
        if (products.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateProductRequest createProductRequest) {
        try {
            var product = createProductUseCase.execute(createProductRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(product);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }
}
