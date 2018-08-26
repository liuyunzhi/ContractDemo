package com.thoughtworks.contractDemo.service;

import com.thoughtworks.contractDemo.entity.Product;
import com.thoughtworks.contractDemo.exception.ProductNotFoundException;
import com.thoughtworks.contractDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product get(Long id) {
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }
}
