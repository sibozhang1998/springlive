package net.nvsoftware.springmono.service;

import net.nvsoftware.springmono.model.Product;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
    Product getById(String id);
    String deleteById(String id);
}
