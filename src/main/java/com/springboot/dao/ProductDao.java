package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
