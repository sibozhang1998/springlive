package net.nvsoftware.springmono.service;

import net.nvsoftware.springmono.model.Product;
import org.springframework.context.annotation.Bean;

public interface ProductService {
    Product save(Product product);
}
