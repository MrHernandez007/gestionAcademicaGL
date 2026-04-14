package com.example;

import java.time.LocalDate;

public class User {

    private String email;
    private String passwordHash;
    private TypeUser type;
    private LocalDate registrationDate;

    private int failedAttempts;
    private boolean blocked;

    public User(String email, String passwordHash, TypeUser type, LocalDate registrationDate) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.type = type;
        this.registrationDate = registrationDate;
        this.failedAttempts = 0;
        this.blocked = false;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public TypeUser getType() {
        return type;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void resetAttempts() {
        failedAttempts = 0;
    }

    public void incrementAttempts() {
        failedAttempts++;
        if (failedAttempts >= 3) {
            blocked = true;
        }
    }
}