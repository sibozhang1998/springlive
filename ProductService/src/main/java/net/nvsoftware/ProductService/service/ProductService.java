package net.nvsoftware.ProductService.service;

import net.nvsoftware.ProductService.model.ProductRequest;
import net.nvsoftware.ProductService.model.ProductResponse;

public interface ProductService {
    Long addProduct(ProductRequest productRequest);
    ProductResponse getById(long id);
}
