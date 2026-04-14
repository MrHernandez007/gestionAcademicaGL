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

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void assignCourse(Course course){
        courses.add(course);
    }

    public void getCoursesInformation(){
        System.out.println("Courses: ");
        for(var a : courses){
            System.out.println("Name: " + a.getName());
            System.out.println("Description: " + a.getDescription());
            System.out.println("Criteria: " + a.getCriteria());
            System.out.println("______________________________________");
        }
    }

    public void addTest(Course course, Test test){
        if(courses.contains(course)){
            course.addTest(test);
            System.out.println("Test added correctly");
        }
        System.out.println("You are not in this course");
    }

    public void removeTest(Course course, Test test){
        if(courses.contains(course)){
            course.getTests().remove(test);
            System.out.println("Test removed correctly.");
        }
        System.out.println("You are not in this course");
    }


    

    



    

}
