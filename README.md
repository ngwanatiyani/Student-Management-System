# Student Management System-ADP372S Mini Assignment 1


##  Author: **Ngwana Tiyani**


 
**Module:** ADP372S - Mini Assignment 1  
**Date:** 16 February 2026

---

## Project Overview

This project is a Student Management System that demonstrates object-oriented programming principles in Java. It manages two types of students: **Undergraduate Students** and **Graduate Students**, using inheritance and the Builder design pattern.

---

## SOLID Principles Applied

### 1. Single Responsibility Principle (SRP)

> *"A class should have one, and only one, reason to change."*

**Implementation in this project:**

Each class in the project has a single, well-defined responsibility:

- **`Student.java`** (Abstract Base Class)  
  Responsible only for defining the common structure and contract for all student types. It declares the shared fields (`studentId`, `name`, `email`, `department`) and abstract methods that subclasses must implement.

  ```java
  public abstract class Student {
      protected String studentId;
      protected String name;
      protected String email;
      protected String department;

      public abstract double calculateTuition();
      public abstract String getStudentType();
      public void displayStudentDetails() {}
  }
  ```

- **`UndergraduateStudent.java`**  
  Responsible only for undergraduate student-specific logic, including:
  - Managing undergraduate-specific fields (`creditHours`, `scholarshipAmount`)
  - Calculating tuition based on credit hours and scholarship
  - Displaying undergraduate student details

  ```java
  @Override
  public double calculateTuition() {
      return (creditHours * 1000.0) - scholarshipAmount;
  }
  ```

- **`GraduateStudent.java`**  
  Responsible only for graduate student-specific logic, including:
  - Managing graduate-specific fields (`researchAssistant`, `stipend`)
  - Calculating tuition with research assistant stipend deduction
  - Displaying graduate student details

  ```java
  @Override
  public double calculateTuition() {
      double baseTuition = 15000.0;
      return researchAssistant ? (baseTuition - stipend) : baseTuition;
  }
  ```

- **`Main.java`**  
  Responsible only for application entry point and demonstration of the system by creating student objects and displaying their details.

- **Builder Classes (Inner Classes)**  
  Each student subclass contains its own `Builder` class, responsible solely for constructing instances of that specific student type. This separates object construction from the object's core business logic.

---

### 2. Open/Closed Principle (OCP)

> *"Software entities should be open for extension, but closed for modification."*

**Implementation in this project:**

The abstract `Student` class is designed to be **open for extension** (new student types can be added) but **closed for modification** (existing code doesn't need to change when adding new types).

**How it works:**

1. **The abstract `Student` class defines a contract** through abstract methods:
   ```java
   public abstract double calculateTuition();
   public abstract String getStudentType();
   ```

2. **New student types extend without modifying existing code:**

   - `UndergraduateStudent` extends `Student` and provides its own implementation:
     ```java
     public class UndergraduateStudent extends Student {
         @Override
         public double calculateTuition() {
             return (creditHours * 1000.0) - scholarshipAmount;
         }

         @Override
         public String getStudentType() {
             return "Undergraduate Student";
         }
     }
     ```

   - `GraduateStudent` extends `Student` with different logic:
     ```java
     public class GraduateStudent extends Student {
         @Override
         public double calculateTuition() {
             double baseTuition = 15000.0;
             return researchAssistant ? (baseTuition - stipend) : baseTuition;
         }

         @Override
         public String getStudentType() {
             return "Graduate Student";
         }
     }
     ```

3. **Extensibility Example:**  
   If we need to add a new student type (e.g., `DoctoralStudent` or `ExchangeStudent`), we simply create a new class that extends `Student` and implements the abstract methods. **No changes are required** to `Student.java`, `UndergraduateStudent.java`, `GraduateStudent.java`, or any existing code.

   ```java
   // Example of future extension (no modification to existing classes needed)
   public class DoctoralStudent extends Student {
       @Override
       public double calculateTuition() {
           // Doctoral-specific tuition calculation
           return 20000.0 - researchGrant;
       }

       @Override
       public String getStudentType() {
           return "Doctoral Student";
       }
   }
   ```

---

## Design Pattern Used: Builder Pattern

The **Builder Pattern** is used for constructing `UndergraduateStudent` and `GraduateStudent` objects. This pattern provides:

- **Readable object creation** with method chaining
- **Immutability** - student objects have `final` fields set only through the builder
- **Flexibility** - optional parameters can be set in any order

**Example usage in `Main.java`:**

```java
UndergraduateStudent undergrad = new UndergraduateStudent.Builder()
        .setStudentId("23117831")
        .setName("Lindokuhle Mthembu")
        .setEmail("23117831@mycput.ac.za")
        .setDepartment("Business Management")
        .setCreditHours(15)
        .setScholarshipAmount(7000.0)
        .build();

GraduateStudent grad = new GraduateStudent.Builder()
        .setStudentId("241367832")
        .setName("Masana Baloyi")
        .setEmail("241367832@mycput.ac.za")
        .setDepartment("Informatics and Design")
        .setResearchAssistant(true)
        .setStipend(5000.0)
        .build();
```

---


**Expected Output:**
```
--- Undergraduate Student ---
ID: 23117831
Name: Lindokuhle Mthembu
Email: 23117831@mycput.ac.za
Department: Business Management
Credit Hours: 15
Scholarship: R7000.0
Calculated Tuition: R8000.0

--- Graduate Student ---
ID: 241367832
Name: Masana Baloyi
Email: 241367832@mycput.ac.za
Department: Informatics and Design
Research Assistant: Yes
Stipend: R5000.0
Calculated Tuition: R10000.0
```

---

## Project Structure

```
StudentManagementSystem/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── ac/
                └── za/
                    └── cput/
                        ├── Main.java
                        ├── Student.java
                        ├── GraduateStudent.java
                        └── UndergraduateStudent.java
```

---

## How to Run

1. Ensure you have Java JDK 11 or higher installed
2. Open the project in your IDE (NetBeans, IntelliJ, etc.)
3. Run `Main.java`

## Conclusion

This Student Management System demonstrates clean object-oriented design by applying SOLID principles, particularly the **Single Responsibility Principle** and the **Open/Closed Principle**. The use of the **Builder Pattern** further enhances code readability and maintainability.






---

