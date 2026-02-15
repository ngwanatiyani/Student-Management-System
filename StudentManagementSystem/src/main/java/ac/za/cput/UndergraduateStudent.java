package ac.za.cput;


//Name and Surname: Tiyani Ngwana
//Student Number: 231266731
//ADP372S - Mini Assignment 1 - Student Management System
//Date: 16 February 2026

public class UndergraduateStudent extends Student
{
    private final int creditHours; // [cite: 29]
    private final double scholarshipAmount; // [cite: 30]

    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        return (creditHours * 1000.0) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() { //
        System.out.println("--- " + getStudentType() + " ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: R" + scholarshipAmount);
        System.out.println("Calculated Tuition: R" + calculateTuition());
    }

    // Own Builder class [cite: 37]
    public static class Builder {
        private String studentId, name, email, department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setCreditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }

        //End of program
    }
}
