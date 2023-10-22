package net.nvsoftware.ProductService.service;

import net.nvsoftware.ProductService.model.ProductRequest;

public interface ProductService {
    Long addProduct(ProductRequest productRequest);
}
