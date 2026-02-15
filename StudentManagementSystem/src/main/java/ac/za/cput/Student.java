package ac.za.cput;


//Name and Surname: Tiyani Ngwana
//Student Number: 231266731
//ADP372S - Mini Assignment 1 - Student Management System
//Date: 16 February 2026

public abstract class Student
{
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();


    public void displayStudentDetails() {}

    //End of program
}
