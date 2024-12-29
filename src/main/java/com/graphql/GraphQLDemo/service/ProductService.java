package com.graphql.GraphQLDemo.service;

import com.graphql.GraphQLDemo.entity.Product;
import com.graphql.GraphQLDemo.repository.ProductRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> products = productRepository.findAll();
        products.forEach(product -> System.out.println(product));
        return products;
    }
    public List<Product> getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }
    public Product updateStockById(int id,int quantity){
        Product existingProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("product not found with id "+id));
        existingProduct.setStock(quantity);
        return productRepository.save(existingProduct);
    }
    public Product receiveNewShipmen(int id,int quantity){
        Product existingProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("product not found with id "+id));
        existingProduct.setStock(existingProduct.getStock()+quantity);
        return productRepository.save(existingProduct);
    }
}
