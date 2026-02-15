# Student Management System

A Java-based Student Management System built for university administration, demonstrating the **Builder Design Pattern** and **SOLID Principles**.

---

## 📋 Project Overview

This application manages student records with support for both undergraduate and graduate students. It uses the Builder pattern to create student objects with multiple optional attributes, ensuring clean and maintainable code.

---

## 🏗️ Design Patterns

### Builder Design Pattern
- Simplifies construction of complex student objects
- Handles multiple optional attributes elegantly
- Provides a fluent interface for object creation
- Separates object construction from representation

---

## ⚙️ SOLID Principles Applied

### 1. Single Responsibility Principle (SRP)
**Definition:** A class should have only one reason to change.

**Application:** 
- `UndergraduateStudent` and `GraduateStudent` classes focus solely on storing student data and calculating tuition
- Complex construction logic is delegated to internal `Builder` static nested classes
- Changes to construction logic don't affect core student classes

### 2. Liskov Substitution Principle (LSP)
**Definition:** Objects of a superclass should be replaceable with objects of its subclasses without breaking the application.

**Application:**
- Both `UndergraduateStudent` and `GraduateStudent` extend the abstract `Student` class
- The `Main` class can treat both subclasses uniformly as `Student` objects
- Both subclasses properly implement `calculateTuition()` and `displayStudentDetails()` methods
- Polymorphic behavior works seamlessly throughout the application

---

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ngwanatiyani/Student-Management-System.git
   ```

2. **Open the project:**
   - Use your preferred IDE (IntelliJ IDEA, Eclipse, or NetBeans)

3. **Run the application:**
   - Execute `Main.java`

4. **View output:**
   - Student details and calculated tuition will be displayed in the console

---

## 🛠️ Technologies Used

- **Language:** Java
- **Design Pattern:** Builder Pattern
- **Principles:** SOLID

---

## 📂 Project Structure

```
Student-Management-System/
├── src/
│   ├── Student.java (Abstract base class)
│   ├── UndergraduateStudent.java
│   ├── GraduateStudent.java
│   └── Main.java
└── README.md
```

---

## 👨‍💻 Author

**Ngwanatiyani**

---

## 📝 License

This project is part of the ADP372S Mini Assignment 1.