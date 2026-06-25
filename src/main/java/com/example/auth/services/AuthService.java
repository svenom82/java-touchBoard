package com.example.auth.services;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import com.example.auth.repositories.UserRepository;

public class AuthService {

    public static void registerUser(String email, String password){
        // проверка логина
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Ошибка: введен некорректный формат электронной почты");
        }
        // проверка длины почты
        if (email.length() > 50) {
            throw new IllegalArgumentException("Длина E-mail не должна превышать 50 символов");
        }
        // проверка длины пароля
        if (password.length() < 6 || password.length() > 30) {
            throw new IllegalArgumentException("Пароль должен быть от 6 до 30 символов");
        }

        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatterTime = now.format(formatter);
        System.out.println("Профиль " + email + " успешно создан. Время регистрации: " + formatterTime);

        UserRepository.saveUser(email, password);


    }

}
