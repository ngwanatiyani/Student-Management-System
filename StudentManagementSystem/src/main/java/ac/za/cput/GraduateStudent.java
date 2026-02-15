package ac.za.cput;



//Name and Surname: Tiyani Ngwana
//Student Number: 231266731
//ADP372S - Mini Assignment 1 - Student Management System
//Date: 16 February 2026

public class GraduateStudent extends Student
{
    private final boolean researchAssistant;
    private final double stipend;

    private GraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 15000.0;
        return researchAssistant ? (baseTuition - stipend) : baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("--- " + getStudentType() + " ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + (researchAssistant ? "Yes" : "No"));
        System.out.println("Stipend: R" + stipend);
        System.out.println("Calculated Tuition: R" + calculateTuition());
    }

    public static class Builder {
        private String studentId, name, email, department;
        private boolean researchAssistant;
        private double stipend;

        public Builder setStudentId(String studentId) { this.studentId = studentId; return this; }
        public Builder setName(String name) { this.name = name; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setDepartment(String department) { this.department = department; return this; }
        public Builder setResearchAssistant(boolean researchAssistant) { this.researchAssistant = researchAssistant; return this; }
        public Builder setStipend(double stipend) { this.stipend = stipend; return this; }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }

        //End of program
    }
}
