package model;

public class Student extends User {

    public Student(String id, String name, String email, String disabilityStatus) {
        super(id, name, email);
    }

    public void viewDashboard() {
        System.out.println("Viewing dashboard");
    }
}