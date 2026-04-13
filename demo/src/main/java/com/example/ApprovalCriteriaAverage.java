package com.example;

public class ApprovalCriteriaAverage implements ApprovalCriteria{

    private double minimun;

    public ApprovalCriteriaAverage(double minimun) {
        this.minimun = minimun;
    }

    @Override
    public boolean pass(Inscription inscripcion) {
        return inscripcion.calcAverage() >= minimun; 
    }
    

}
