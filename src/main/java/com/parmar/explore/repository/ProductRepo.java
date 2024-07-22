package com.parmar.explore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parmar.explore.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
