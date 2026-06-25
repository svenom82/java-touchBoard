package com.example.auth.repositories;
import java.util.HashMap;
import java.util.Map;



public class UserRepository {
    private static Map<String, String> database = new HashMap<>();

    public static void saveUser(String email, String password) {
        database.put(email, password);
        System.out.println("Системный лог: данные профиля " + email + " успешно записаны в базу");
    }
}
