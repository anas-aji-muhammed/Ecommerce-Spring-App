package com.anasajimuhammed.ecommercebackend.services.impl;

import com.anasajimuhammed.ecommercebackend.models.Products;
import com.anasajimuhammed.ecommercebackend.repository.ProductRepository;
import com.anasajimuhammed.ecommercebackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * And and Update Product
     * @param product
     * @return
     */
    @Override
    @Transactional
    public Products addProduct(Products product) {
        return productRepository.save(product);
    }

    /**
     * Delete product
     * @param productId
     * @return
     */
    @Override
    @Transactional
    public boolean deleteProduct(Long productId) {
        Optional<Products> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            productRepository.delete(optionalProduct.get());
            return true;
        } else {
            return false;
        }
    }

}
