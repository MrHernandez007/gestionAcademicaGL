package com.example;

import java.util.Base64;

public class TokenUtil {

    public static String generarToken(String email) {
        String data = email + ":" + System.currentTimeMillis();
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public static String obtenerEmail(String token) {
        String decoded = new String(Base64.getDecoder().decode(token));
        return decoded.split(":")[0];
    }
}