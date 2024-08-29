package com.student.information;

import java.util.ArrayList;
import java.util.List;

public class Course implements  ICourse {
    private String id;
    private String name;
    private List<IStudent> enrolledStudents = new ArrayList<>();

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void enrollStudent(IStudent student) {
        enrolledStudents.add(student);
    }

    @Override
    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }
}

