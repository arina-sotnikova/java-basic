package ru.otus.home.homework4;

import java.time.LocalDate;

public class User {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final LocalDate birthDate;
    private final String email;

    public LocalDate getBirthDate() {return birthDate;}

    public User(String lastName, String firstName, String patronymic, LocalDate birthDate, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.email = email;
    }

    public void getUsersInfo() {
        System.out.println("ФИО: " + this.lastName + " " + this.firstName + " " + this.patronymic);
        System.out.println("Дата рождения: " + this.birthDate);
        System.out.println("E-mail: " +  this.email);
    }
}
