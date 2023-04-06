package com.vjl.industries.productsservice.repository;

import com.vjl.industries.productsservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
