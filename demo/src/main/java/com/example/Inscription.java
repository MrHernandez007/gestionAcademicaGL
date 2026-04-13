package com.example;

import java.util.ArrayList;
import java.util.List;

public class Inscription {

    private Student student;
    private Course course;
    private List<TestResult> testResult;

    public Inscription(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.testResult = new ArrayList<>();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public List<TestResult> getTestResult() {
        return testResult;
    }

    public double calcAverage(){

        if (testResult.isEmpty()) {
            return 0;
        } 
        double sum = 0;
        for(TestResult re : testResult){

            sum += re.getGrade();

        }
        return sum / testResult.size();
    }

    public boolean didStudentPass(){
        return course.getCriteria().pass(this);
    }

    public void addTestResult(TestResult r){
        testResult.add(r);
    }

    

    
    

}
