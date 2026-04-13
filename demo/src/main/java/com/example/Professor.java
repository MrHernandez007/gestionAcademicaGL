package com.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private User user;
    private String name;
    private String lastName;

    private List<Course> courses;

    public Professor(User user, String name, String lastName) {
        this.user = user;
        this.name = name;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void assignCourse(Course course){
        courses.add(course);
    }

    



    

}
