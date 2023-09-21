package com.anasajimuhammed.ecommercebackend.utils;
import com.anasajimuhammed.ecommercebackend.dto.ProductDTO;
import com.anasajimuhammed.ecommercebackend.models.Products;

/**
 * Helper Class for Entity to DTO and Vice-versa conversion.
 */
public class DtoEntityMapper {

    /**
     * Converts Product DTO to Entity
     * @param productDTO
     * @return Products
     */
    public static Products productConvertToEntity(ProductDTO productDTO) {
        Products product = new Products();
        if(productDTO.getId() != null){
            product.setId(productDTO.getId());
        }
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setSku(productDTO.getSku());
        product.setImageUrl(productDTO.getImageUrl());
        product.setActive(productDTO.getActive());
        product.setCategoryId(productDTO.getCategoryId());
        product.setCostPrice(productDTO.getCostPrice());
        product.setQuantity(productDTO.getQuantity());
        return product;
    }

    /**
     * Converts Product Entity to DTO
     * @param product
     * @return ProductDTO
     */
    public static ProductDTO productConvertToDto(Products product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setDescription(product.getDescription());
        return productDTO;
    }
}
