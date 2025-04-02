# Shop Employee Notification System

This project demonstrates the **Observer Design Pattern** in a shop employee notification system. The system allows employees to apply for a job at a shop, and once they are hired, notifications are sent to them.

## 📌 Overview
- The **Observer Pattern** is implemented where employees (observers) receive updates when they are hired.
- A **Shop** acts as a subject, maintaining a list of observers (employees) who want to be notified about job-related updates.
- A **ShopFactory** is used to create shop instances, following the Factory Design Pattern.

## 🛠️ Technologies Used
- Java
- Object-Oriented Design Principles
- Design Patterns (Observer, Factory)

## 🏗️ Class Structure

### **1. `ShopEmployee` (Observer)**
- Implements the `Observer` interface.
- Receives notifications when an update is sent by the shop.
- Method `applyForJob(Shop shop)` allows an employee to apply for a vacancy.

### **2. `ShopFactory` (Factory Pattern)**
- Provides a method `createShop()` to create a new `Shop` instance.

### **3. `Main` (Execution Point)**
- Creates a `Shop` using `ShopFactory`.
- Creates `ShopEmployee` objects and registers them as observers.
- Simulates a job application and notification process.

## 🚀 How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/shop-observer-pattern.git
   ```
2. Navigate to the project directory:
   ```sh
   cd shop-observer-pattern
   ```
3. Compile and run the program:
   ```sh
   javac Main.java
   java Main
   ```

## 📖 Example Output
```
Madiyar: Notification - You have been hired as a Commercial Specialist.
```

## 📌 Key Concepts
- **Observer Pattern**: Ensures that when a shop hires an employee, all relevant employees receive notifications.
- **Factory Pattern**: Simplifies the creation of shop instances.
- **Encapsulation & Reusability**: The system follows OOP principles to ensure modularity and flexibility.


