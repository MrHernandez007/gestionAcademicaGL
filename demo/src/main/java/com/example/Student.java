package com.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private User user;
    private String name;
    private String lastName;

   private List<Inscription> inscriptions;

   public Student(User user, String name, String lastName) {
    this.user = user;
    this.name = name;
    this.lastName = lastName;
    this.inscriptions = new ArrayList<>();
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

   public List<Inscription> getInscripcions() {
    return inscriptions;
   }

   public void registerToCourse(Course course){
    for (Inscription i : inscriptions){
        if (i.getCourse().equals(course)) {
            throw new RuntimeException("Alumno ya inscrito/ Ya inscrito");
        }else{
            Inscription newInscription = new Inscription(this, course);
            inscriptions.add(newInscription);
            course.addInscription(newInscription);

        }

    }

    /* BORRADOR PARA EL PROMEDIO GENERAL del alumno
    public double calculateGlobalAverage(){

        List<Course> getApprovedCourses()
    }
    */

   }

   

   




    



}
