package Person;

import java.util.ArrayList;

public class Student extends Person{
    String major;
    ArrayList<String> enrolledCourses;

    public Student(String name, String email, String major) {
        super(name, email);
        this.major = major;
    }


    @Override
    void displayInfo() {
        System.out.println("Student: " + this.name + " " + this.email + " major: " + this.major);
    }
}
