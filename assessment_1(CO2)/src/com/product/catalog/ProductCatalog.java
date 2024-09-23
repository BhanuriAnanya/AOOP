package com.product.catalog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductCatalog implements ProductCatalogOperations {
    private Map<String, Product> productMap;

    public ProductCatalog() {
        this.productMap = new HashMap<>();
    }

    @Override
    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
        System.out.println("Product added: " + product);
    }

    @Override
    public void removeProduct(String productId) {
        Product removedProduct = productMap.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    @Override
    public Product getProductById(String productId) {
        return productMap.get(productId);
    }

    @Override
    public Set<Product> getAllProducts() {
        return new HashSet<>(productMap.values());
    }
}
