package ac.za.cput;


//Name and Surname: Tiyani Ngwana
//Student Number: 231266731
//ADP372S - Mini Assignment 1 - Student Management System
//Date: 16 February 2026
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
// 1. Create Undergraduate Student using Builder
        UndergraduateStudent undergrad = new UndergraduateStudent.Builder()
                .setStudentId("23117831")
                .setName("Lindokuhle Mthembu")
                .setEmail("23117831@mycput.ac.za")
                .setDepartment("Business Management")
                .setCreditHours(15)
                .setScholarshipAmount(7000.0)
                .build();

        // 1. Create Graduate Student using Builder
        GraduateStudent grad = new GraduateStudent.Builder()
                .setStudentId("241367832")
                .setName("Masana Baloyi")
                .setEmail("241367832@mycput.ac.za")
                .setDepartment("Informatics and Design")
                .setResearchAssistant(true)
                .setStipend(5000.0)
                .build();

        // 3. Display the students' details [cite: 40]
        undergrad.displayStudentDetails();
        System.out.println();
        grad.displayStudentDetails();

        //End of program
    }
}