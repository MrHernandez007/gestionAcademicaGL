package com.example;

public class ApprovalCriteriaCombined implements ApprovalCriteria{

    private double minimumNote;
    private double minimumAverage;
    
    @Override
    public boolean pass(Inscription inscripcion) {
        
        for (TestResult re : inscripcion.getTestResults()){
            if (re.getGrade() < minimumNote) {
                return false;
            }
        }
        return inscripcion.calcAverage() >= minimumAverage;
    }

    

}
