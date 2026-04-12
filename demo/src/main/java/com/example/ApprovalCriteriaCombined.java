package com.example;

public class ApprovalCriteriaCombined implements ApprovalCriteria{

    private double minimunNote;
    private double minimunAverage;
    
    @Override
    public boolean pass(Inscription inscripcion) {
        
        for (TestResult re : inscripcion.getTestResult()){
            if (re.getGrade() < minimunNote) {
                return false;
            }
        }
        return inscripcion.calcAverage() >= minimunAverage;
    }

    

}
