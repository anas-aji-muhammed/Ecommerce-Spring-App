package com.anasajimuhammed.ecommercebackend.controllers.admin;

import com.anasajimuhammed.ecommercebackend.dto.ProductDTO;
import com.anasajimuhammed.ecommercebackend.models.Products;
import com.anasajimuhammed.ecommercebackend.services.ProductService;
import com.anasajimuhammed.ecommercebackend.utils.ApiResponseGeneric;
import com.anasajimuhammed.ecommercebackend.utils.DtoEntityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller For Product Admin Related  APIs
 */
@RestController
@RequestMapping("/products/")
public class AdminProductController {
    private final ProductService productService;
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    public AdminProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("add")
    public ResponseEntity saveProduct(@RequestBody ProductDTO productDTO){
        logger.info("Request body --", productDTO);
        Products product = DtoEntityMapper.productConvertToEntity(productDTO);
        Products savedProduct = productService.addProduct(product);
        ApiResponseGeneric<Products> apiResponse = new ApiResponseGeneric<>("Product Added", savedProduct);
        return  ResponseEntity.ok(apiResponse);
    }

    @DeleteMapping
    public ResponseEntity deleteProduct(Long productId){
        try {
            productService.deleteProduct(productId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }






}
