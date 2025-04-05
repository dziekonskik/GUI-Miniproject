package Person;

import Course.Course;

import java.util.ArrayList;

public class Professor extends Person {
    String department;
    ArrayList<Course> coursesTaught;

    public Professor(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println("Professor: " + this.name + " " + this.email + " department: " + this.department);
    }
}
