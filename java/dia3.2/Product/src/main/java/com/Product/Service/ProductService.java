package com.Product.Service;

import com.Product.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Anotação especializada
@Service
public class ProductService {

  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  // Novo método
  public String getMessage() {
    return productRepository.getMessage();
  }
}