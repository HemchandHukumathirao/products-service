package com.vjl.industries.productsservice.controller;

import com.vjl.industries.productsservice.dto.ProductRequest;
import com.vjl.industries.productsservice.repository.ProductRepository;
import com.vjl.industries.productsservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }
}
