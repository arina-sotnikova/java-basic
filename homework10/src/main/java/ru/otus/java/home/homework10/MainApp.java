package ru.otus.java.home.homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person("Husserl", "Edmund", "Gustav Albrecht");
        Person person2 = new Person("Comte", "Auguste", "Marie Francois Xavier");
        Person person3 = new Person("Marx", "Karl", "Heinrich");

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add(person1, "900");
        phoneBook.add(person2, "112");
        phoneBook.add(person3, "+19217540820");

        Map<Person, Set<String>> number1 = phoneBook.find("Husserl");
        assert phoneBook.containsPhoneNumber("900");
    }
}
