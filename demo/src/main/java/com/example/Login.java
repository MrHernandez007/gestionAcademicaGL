package com.example;

public class Login {

    private UserDB db = new UserDB();

    public String login(String email, String password) {

        User user = db.findByEmail(email);

        if (user == null) {
            return "Usuario no existe";
        }

        if (user.isBlocked()) {
            return "Usuario bloqueado";
        }

        String hashedInput = hash(password);

        if (!user.getPasswordHash().equals(hashedInput)) {

            user.incrementAttempts(); // suma intento

            if (user.isBlocked()) {
                return "Usuario bloqueado por intentos fallidos";
            }

            return "Contraseña incorrecta. Intentos: " + user.getFailedAttempts();
        }

        // login correcto
        user.resetAttempts();

        return TokenUtil.generarToken(user.getEmail());
    }

    private String hash(String password) {
        return Integer.toString(password.hashCode());
    }
}