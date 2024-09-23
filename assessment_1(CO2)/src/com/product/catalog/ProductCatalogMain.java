package com.product.catalog;

import java.util.Set;

public class ProductCatalogMain {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Create some products
        Product product1 = new Product("P001", "Laptop", 750.00);
        Product product2 = new Product("P002", "Smartphone", 500.00);
        Product product3 = new Product("P003", "Headphones", 50.00);

        // Add products to catalog
        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);

        // Retrieve a product by ID
        Product retrievedProduct = catalog.getProductById("P002");
        System.out.println("Retrieved product: " + retrievedProduct);

        // Remove a product
        catalog.removeProduct("P001");

        // Display all products
        Set<Product> allProducts = catalog.getAllProducts();
        System.out.println("All products in catalog:");
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }
}
