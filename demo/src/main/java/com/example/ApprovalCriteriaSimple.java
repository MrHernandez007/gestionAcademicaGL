package com.example;

public class ApprovalCriteriaSimple implements ApprovalCriteria {

    private double minimun;

    public ApprovalCriteriaSimple(double minimun) {
        this.minimun = minimun;
    }

    @Override
    public boolean pass(Inscription inscripcion) {
        
        for (TestResult tr : inscripcion.getTestResults()){
            if ( tr.getGrade() >= minimun){
                return true;
            }

        }
        return false;
    }

    

    

}
