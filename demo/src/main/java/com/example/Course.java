package com.example;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private Professor professor; //EN DUDA
    private String name;
    private String description; 
    private boolean available;

    private List<Topic> topics;
    private List<Test> tests;
    private List<Inscription> inscriptions; //Aqui se guarda el alumno, curso y resultado del examen.

    private ApprovalCriteria criteria;

    public Course(Professor professor, String name, String description, boolean couseState,
            List<Topic> topics, List<Test> tests, List<Inscription> inscriptions,
            ApprovalCriteria criteria) {
        this.professor = professor; //EN DUDA
        this.name = name;
        this.description = description;
        this.available = false;
        this.topics = new ArrayList<>();
        this.tests = new ArrayList<>();
        this.inscriptions = new ArrayList<>();
        this.criteria = criteria;
    }

    public void addTopic(Topic topic){
        topics.add(topic); //PENDIENTE
    }

    public void removeTopic(Topic topic){
        topics.remove(topic);
    }

    public double calculateTotalDuration(){
        double total = 0;
        for (Topic t: topics){
            total += t.getDurationHour();
        }
        return total;
    }

    public void addTest(Test test){
        tests.add(test);
    }

    public void addInscription(Inscription inscription){
        inscriptions.add(inscription);
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailable() {
        return available;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public List<Test> getTests() {
        return tests;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public ApprovalCriteria getCriteria() {
        return criteria;
    }

    

    







}
