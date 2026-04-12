package com.example;

import java.util.List;

public class Professor {

    private User user;
    private String name;
    private String lastName;

    private List<Course> courses;

    public Professor(User user, String name, String lastName, List<Course> courses) {
        this.user = user;
        this.name = name;
        this.lastName = lastName;
        this.courses = courses;
    }

    

}
