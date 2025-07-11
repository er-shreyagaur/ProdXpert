## ProdXpert

**ProdXpert** is a **Java-based menu-driven console application** designed to manage and analyze various types of products. It allows users to perform operations such as adding, viewing, sorting, and filtering product records based on defined attributes like size, color, brand, price, and subcategory.

---

## 🧾 Introduction & Features

ProdXpert demonstrates core object-oriented principles and efficient data handling using Java’s Collections Framework. It supports operations on multiple product types such as **Shirts**, **T-Shirts**, and **Mobiles**, all stored using a `HashMap` for fast access.

### Key Functionalities:

- **Add new products** (Shirts, T-Shirts, Mobiles)
- **View all products** or filter by type
- **Count products** by:
  - Category
  - Size
  - Brand
  - Subcategory
- **Filter products** based on size, brand, and price
- **Sort products** by price (low to high / high to low)
- **List all available**:
  - Brands
  - Sizes (specific to Shirts)
  - Categories and Subcategories
- **Remove products** using their unique Product ID

This system provides a structured and interactive way to explore object-oriented Java programming and real-time data operations using collections.

---

## 💻 Technologies Used

- **Core Java** – Base language for implementing logic, classes, and control structures.  
- **OOPs Concepts** – Applied through **Inheritance**, **Encapsulation**, and **Polymorphism**.  
- **Collections Framework:**
  - **List (`ArrayList`)** – Maintains ordered product lists with duplicate entries.  
  - **Map (`HashMap`)** – Stores product data with Product ID as key for fast lookup.  
  - **Set (`HashSet`)** – Stores unique values like brands, sizes, and categories.  
  - **Queue (`PriorityQueue`)** – Processes elements based on priority, useful for sorting.  

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

