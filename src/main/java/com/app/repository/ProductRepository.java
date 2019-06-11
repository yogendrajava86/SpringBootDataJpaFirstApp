package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.app.model.Product;
@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
