package com.betrybe.report.service;

import com.betrybe.report.entity.Product;
import com.betrybe.report.repository.ProductRepository;
import com.betrybe.report.service.exception.InvalidDateException;
import com.betrybe.report.service.exception.ProductNotFoundException;
import com.betrybe.report.util.PropertyMapper;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product create(Product product) {
    if (product.getExpirationDate().isBefore(product.getManufactureDate())) {
      throw new InvalidDateException();
    }
    return productRepository.save(product);
  }

  public Product findById(long id) {
    return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
  }

  public void delete(long id) {
    productRepository.deleteById(id);
  }

  public Product update(long id, Product product) {
    Product productDb = findById(id);
    PropertyMapper.copyNonNullProperties(product, productDb);
    return productRepository.save(productDb);
  }

  public List<Product> findExpiredProducts() {
    LocalDate today = LocalDate.now();
    List<Product> products = findAll();
    return products.stream()
        .filter(product -> product.getExpirationDate().isBefore(today))
        .toList();
  }

  public List<Product> findNonExpiredProducts() {
    LocalDate today = LocalDate.now();
    List<Product> products = findAll();
    return products.stream()
        .filter(product -> product.getExpirationDate().isAfter(today))
        .toList();
  }

  public List<Product> findExpiresAtProducts(LocalDate start, LocalDate end) {
    LocalDate today = LocalDate.now();
    List<Product> products = findAll();
    return products.stream()
        .filter(product -> product.getExpirationDate().isAfter(start) && product.getExpirationDate()
            .isBefore(end))
        .toList();
  }
}
