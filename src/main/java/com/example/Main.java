package com.example;
import com.example.auth.services.AuthService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args) {
        try {
            AuthService.registerUser("usermail@.com", "password123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
