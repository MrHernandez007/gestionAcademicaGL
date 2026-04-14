package com.example;

import java.util.ArrayList;
import java.util.List;

public class Administrator {

    private User user;
    private String name;
    private String lastName;

    private List<User> users; //Nuevo

    public Administrator(User user, String name, String lastName, List<User> users) {
        this.user = user;
        this.name = name;
        this.lastName = lastName;
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    //Lista de usuarios
    public List<User> showUsersByType(TypeUser type) {
        List<User> result = new ArrayList<>();

        for (User u : users) {
            if (u.getType() == type) {
                result.add(u);
            }
        }

        return result;
    }

    public List<User> showAllUsers() {
        return users;
    }

    //Nuevo usuario

    public void addUser(User newUser) {
        if (findUserByEmail(newUser.getEmail()) != null) {
            System.out.println("Ya existe un usuario con ese email");
            return;
        }

        users.add(newUser);
        System.out.println("Usuario agregado");
    }

    // remover usuario

    public void removeUser(String email) {
        User userToRemove = findUserByEmail(email);

        // no se puede eliminar si es el único admin
        if (userToRemove.getType() == TypeUser.ADMINISTRATOR && countAdmins() <= 1) {
            System.out.println("No se puede eliminar el único administrador");
            return;
        }

        users.remove(userToRemove);
        System.out.println("Usuario eliminado");
    }

    // Editar

    public void updateUser(String email, String newEmail) {
        User userToUpdate = findUserByEmail(email);

        // validar duplicado
        if (!email.equals(newEmail) && findUserByEmail(newEmail) != null) {
            System.out.println("El nuevo email ya está en uso");
            return;
        }

        userToUpdate.setEmail(newEmail);
        System.out.println("Usuario actualizado");
    }

    // Remove
    public void bajaAdmin(String email) {
        User admin = findUserByEmail(email);

        if (countAdmins() <= 1) {
            System.out.println("Debe existir al menos un administrador");
            return;
        }

        users.remove(admin);
        System.out.println("Administrador eliminado");
    }

    // Resto

    private User findUserByEmail(String email) {
        for (User u : users) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    private int countAdmins() {
        int count = 0;

        for (User u : users) {
            if (u.getType() == TypeUser.ADMINISTRATOR) {
                count++;
            }
        }

        return count;
    }

}
