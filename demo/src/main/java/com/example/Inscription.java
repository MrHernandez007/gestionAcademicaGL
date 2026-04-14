package com.example;

import java.util.ArrayList;
import java.util.List;

public class Inscription {

    private InscriptionStatus status; //Nuevo
    private Student student;
    private Course course;
    private List<TestResult> testResults;

    public Inscription(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.testResults = new ArrayList<>();
        //this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public List<TestResult> getTestResults() {
        return testResults;
    }

    public InscriptionStatus getStatus() {
        return status;
    }

    public double calcAverage(){

        if (testResults.isEmpty()) {
            return 0;
        } 
        double sum = 0;
        for(TestResult re : testResults){

            sum += re.getGrade();

        }
        return sum / testResults.size();
    }

    public boolean didStudentPass(){
        return course.getCriteria().pass(this);
    }

    public void addTestResult(TestResult r){
        testResults.add(r);
    }

    

    

    
    

}
