package com.example.holamundo.util;

import lombok.var;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args) {
        String password = "osvaldo";
        System.out.println("password "+ password);
        System.out.println("password encriptado " + EncriptarPassword(password));

    }

    public static String EncriptarPassword(String password){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
