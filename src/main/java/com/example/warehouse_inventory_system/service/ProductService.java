package com.example.warehouse_inventory_system.service;

import com.example.warehouse_inventory_system.entity.Product;
import com.example.warehouse_inventory_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    public Product updateProduct(Long id, Product newProduct){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(newProduct.getName());
        product.setSku(newProduct.getSku());
        product.setPrice(newProduct.getPrice());

        return productRepository.save(product);
    }
}