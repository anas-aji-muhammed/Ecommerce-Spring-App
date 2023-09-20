package com.anasajimuhammed.ecommercebackend.services.impl;

import com.anasajimuhammed.ecommercebackend.models.Products;
import com.anasajimuhammed.ecommercebackend.repository.ProductRepository;
import com.anasajimuhammed.ecommercebackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Products addProduct(Products product) {
        return productRepository.save(product);
    }
}
