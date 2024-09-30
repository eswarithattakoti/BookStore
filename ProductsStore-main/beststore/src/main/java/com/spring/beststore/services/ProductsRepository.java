package com.spring.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

	
}
