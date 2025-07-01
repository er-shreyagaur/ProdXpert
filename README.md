# ProdXpert

**ProdXpert** is a Java-based console application designed to manage and analyze various types of products. It allows users to perform operations such as adding, viewing, sorting, and filtering product records based on defined attributes like size, color, brand, price, and subcategory.

---

## 🧾 Introduction / Overview

ProdXpert simulates a product inventory and management system using Java. The application is built with a strong focus on object-oriented principles and efficient data handling through the use of Java collections.

Users can:
- Add products
- View all or filtered products
- Count specific types or subtypes
- Sort products by price
- List available sizes, brands, and subcategories
- Remove products by ID

This makes it a well-rounded tool for understanding product data operations in a structured and interactive manner.

---

## 🚀 Features

- Add new products (Shirts, T-Shirts, Mobiles)
- View all products or filter by type
- Count products by:
  - Category
  - Size
  - Brand
  - Subcategory
- Filter products based on size, brand, and price
- Sort products (e.g., Shirts and Mobiles) by price
- List all available:
  - Brands
  - Sizes
  - Categories and Subcategories
- Remove a product using Product ID

---

## 💻 Technologies Used

- **Core Java**
- **Collections Framework**
- **HashMap**
- **Object-Oriented Programming (OOPs)**
- **Exception Handling**
- **Generics**
- **Eclipse IDE**

---

## 📂 Folder Structure / File Description

| File Name          | Description |
|--------------------|-------------|
| `Main.java`        | Entry point to launch the application |
| `MenuHandler.java` | Handles user interaction and menu navigation |
| `Service.java`     | Contains business logic and core operations (CRUD, filters, sort, count, etc.) |
| `Product.java`     | Base class for all products (category, brand, price) |
| `Shirt.java`       | Inherits from `Product`; includes size, color, and subcategory |
| `Tshirt.java`      | Inherits from `Product`; includes size, color, and subcategory |
| `Mobile.java`      | Inherits from `Product`; includes model, RAM, and storage |

---

## ▶️ How to Run the Project

1. Open the project in **Eclipse IDE**.
2. Ensure all `.java` files are part of the same package or are properly imported.
3. Locate and run `Main.java`.
4. Use the menu in the console to interact with the system.

