package com.catalog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductCatalogImpl implements ProductCatalog {
    // Use a Map to store products with their ID as the key
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
        System.out.println("Added product: " + product.getName());
    }

    @Override
    public void removeProduct(String productId) {
        if (productMap.containsKey(productId)) {
            Product removedProduct = productMap.remove(productId);
            System.out.println("Removed product: " + removedProduct.getName());
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    @Override
    public Product findProductById(String productId) {
        return productMap.get(productId);
    }

    @Override
    public Set<Product> getAllProducts() {
        // Return a Set of all products
        return new HashSet<>(productMap.values());
    }
}
