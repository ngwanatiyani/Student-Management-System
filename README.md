# Student-Management-System-ADP372S Mini Assignment 1

Project Description
This Java application is a Student Management System designed for a university. It utilizes the Builder Design Pattern to handle the creation of student objects with multiple optional attributes. The system supports different student types, including Undergraduate and Graduate students, through inheritance and polymorphism.


SOLID Principles Applied
1. Single Responsibility Principle (SRP)
Definition: A class should have only one reason to change.


Application: In this project, the UndergraduateStudent and GraduateStudent classes are strictly responsible for storing student data and calculating tuition.



Reference: The complex logic of object construction is moved to the internal Builder static nested classes. This ensures that if the way we construct a student changes, we don't have to modify the core student logic itself.

2. Liskov Substitution Principle (LSP)
Definition: Objects of a superclass should be replaceable with objects of its subclasses without breaking the application.


Application: The Main class treats both UndergraduateStudent and GraduateStudent as instances of the abstract Student class.



Reference: Because both subclasses implement the calculateTuition() and displayStudentDetails() methods , the system can call these methods on any Student object without needing to know its specific subtype.


How to Run the Application
Clone this repository:
git clone <your-repo-link>

Open the project in your preferred IDE (IntelliJ, Eclipse, or NetBeans).

Run the Main.java file.

The console will display the details and calculated tuition for the constructed student objects.

Technologies Used

Language: Java 



Pattern: Builder Design Pattern 


Principles: SOLID
