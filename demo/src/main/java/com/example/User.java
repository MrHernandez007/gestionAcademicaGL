package com.example;

public class User {

    private String userName;
    private String email;
    private String paswordHash;
    private TypeUser type;

    private int failedAttempt;
    private boolean blocked;

    public User(String userName, String email, String paswordHash, TypeUser type, int failedAttempt, boolean blocked) {
        this.userName = userName;
        this.email = email;
        this.paswordHash = paswordHash;
        this.type = type;
        this.failedAttempt = 0;
        this.blocked = false;
    }

    public void resetAttempts(){
        failedAttempt = 0;
    }

    public void incrementAttempts(){
        failedAttempt ++;
        if (failedAttempt >= 3){
            blocked = true;
        }
    }

    public boolean isBlobked(){
        return blocked;
    }



    



}
