package com.catalog;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create ProductCatalog instance
        ProductCatalog catalog = new ProductCatalogImpl();

        // Create some products
        Product product1 = new Product("P101", "Laptop", 1200.00);
        Product product2 = new Product("P102", "Smartphone", 700.00);
        Product product3 = new Product("P103", "Tablet", 300.00);

        // Add products to the catalog
        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);

        // Find product by ID
        Product foundProduct = catalog.findProductById("P102");
        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }

        // Display all products
        System.out.println("\nAll products:");
        Set<Product> products = catalog.getAllProducts();
        for (Product p : products) {
            System.out.println(p);
        }

        // Remove a product
        catalog.removeProduct("P103");

        // Display all products after removal
        System.out.println("\nAll products after removal:");
        products = catalog.getAllProducts();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
