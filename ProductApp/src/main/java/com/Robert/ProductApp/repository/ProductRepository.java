package com.Robert.ProductApp.repository;

import com.Robert.ProductApp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
