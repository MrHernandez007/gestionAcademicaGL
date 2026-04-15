package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDB {

    private List<User> users = new ArrayList<>();

    public UserDB() {
        users.add(new User(
                "admin@mail.com",
                hash("1234"),
                TypeUser.ADMINISTRATOR,
                LocalDate.now()
        ));

        users.add(new User(
                "user@mail.com",
                hash("abcd"),
                TypeUser.STUDENT,
                LocalDate.now()
        ));
    }

    public User findByEmail(String email) {
        for (User u : users) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    // hash simple (igual que antes)
    private String hash(String password) {
        return Integer.toString(password.hashCode());
    }
}