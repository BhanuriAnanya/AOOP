package com.product.catalog;

import java.util.Set;

public interface ProductCatalogOperations {
    void addProduct(Product product);
    void removeProduct(String productId);
    Product getProductById(String productId);
    Set<Product> getAllProducts();
}
