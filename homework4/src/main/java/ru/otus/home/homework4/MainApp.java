package ru.otus.home.homework4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Schiller", "Friedrich", "Johann Christoph",
                        LocalDate.of(1759, 11, 10),
                        "friedrichschiller@beautifulsoul.com"),
                new User("Fichte", "Johann", "Gottlieb",
                        LocalDate.of(1762, 5, 19),
                        "johanngottliebfichte@einbildungskraft.com"),
                new User("Heisenberg", "Werner", "Karl",
                        LocalDate.of(1901, 12, 1),
                        "wernerkarlheisenberg@yahoo.com"),
                new User("Frege", "Gottlob", "Friedrich Ludwig",
                        LocalDate.of(1848, 11, 8),
                        "gottlobfrege@worldoflogic.com"),
                new User("Goedel", "Kurt", "Friedrich",
                        LocalDate.of(1906, 4, 28),
                        "kurtgoedel@incompleteness.com"),
                new User("Anselmo", "Philip", "Hansen",
                        LocalDate.of(1968, 6, 30),
                        "philanselmo@pantera.com"),
                new User("Softpaws", "Kitty", "Kittens",
                        LocalDate.of(2011, 9, 9),
                        "kittysoftpaws@gmail.com"),
                new User("Searle", "John", "Rogers",
                        LocalDate.of(1932, 7, 31),
                        "johnsearle@chineseroom.com"),
                new User("Shrek", "Shrek", "Shrek",
                        LocalDate.of(2001, 4, 22),
                        "shrek@swamp.com"),
                new User("Anderson", "Thomas", "A.",
                        LocalDate.of(1999, 3, 31),
                        "thomasanderson@gmail.com"),
        };

        LocalDate today = LocalDate.now();
        Arrays.stream(users).filter(user -> Period.between(user.getBirthDate(), today).getYears() > 40).forEach(User::getUsersInfo);
    }
}

