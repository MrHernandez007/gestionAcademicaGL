package com.example;

public class ApprovalCriteriaAvergae implements ApprovalCriteria{

    private double minimun;

    public ApprovalCriteriaAvergae(double minimun) {
        this.minimun = minimun;
    }

    @Override
    public boolean pass(Inscription inscripcion) {
        return inscripcion.calcAverage() >= minimun; 
    }
    

}
