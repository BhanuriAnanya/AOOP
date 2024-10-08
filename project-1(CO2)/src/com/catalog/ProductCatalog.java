package com.catalog;

import java.util.Set;

public interface ProductCatalog {
    void addProduct(Product product);
    void removeProduct(String productId);
    Product findProductById(String productId);
    Set<Product> getAllProducts();
}
