package Person;

import Course.Course;
import Interfaces.Registrable;

import java.util.ArrayList;

public class Student extends Person implements Registrable {
    String major;
    ArrayList<Course> enrolledCourses;

    public Student(String name, String email, String major) {
        super(name, email);
        this.major = major;
    }


    @Override
    void displayInfo() {
        System.out.println("Student: " + this.name + " " + this.email + " major: " + this.major);
    }

    public void registerCourse(Course course) {
        if (this.enrolledCourses.contains(course))
            throw new UnsupportedOperationException("This student is already erolled to this course.");
        this.enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        if (!this.enrolledCourses.contains(course))
            throw new UnsupportedOperationException("This student is not erolled to this course.");
        enrolledCourses.remove(course);
    }
}
