package com.InventoryManagementSystem;

import java.util.*;

public class InventoryManagementSystem {
    
    // Inner Product class
    static class Product {
        int productId;
        String productName;
        int quantity;
        double price;

        Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return productId + " | " + productName + " | Qty: " + quantity + " | Price: ₹" + price;
        }
    }

    // Inventory using HashMap
    static HashMap<Integer, Product> inventory = new HashMap<>();

    // Add a product
    public static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    // Update a product
    public static void updateProduct(int id, int newQty, double newPrice) {
        Product p = inventory.get(id);
        if (p != null) {
            p.quantity = newQty;
            p.price = newPrice;
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    // Delete a product
    public static void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    // Display all products
    public static void displayInventory() {
        System.out.println("\n--- Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        addProduct(new Product(101, "Mouse", 50, 299.99));
        addProduct(new Product(102, "Keyboard", 30, 499.49));
        addProduct(new Product(103, "Monitor", 20, 5999.00));

        displayInventory();

        updateProduct(102, 25, 479.99);
        deleteProduct(101);

        displayInventory();
    }
}
