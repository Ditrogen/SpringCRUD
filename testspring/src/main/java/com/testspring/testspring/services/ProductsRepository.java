package com.testspring.testspring.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testspring.testspring.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
