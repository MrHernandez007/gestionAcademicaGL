package com.example;

public class Topic {

    private String title;
    private String description;
    private double durationHour;
    
    public Topic(String title, String description, double durationHour) {
        this.title = title;
        this.description = description;
        this.durationHour = durationHour;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getDurationHour() {
        return durationHour;
    }

    

    

}
