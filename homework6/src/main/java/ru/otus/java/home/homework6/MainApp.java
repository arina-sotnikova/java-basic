package ru.otus.java.home.homework6;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Gato", 50),
                new Cat("Winston", 70),
                new Cat("Emmanuel", 40),
                new Cat("Si", 20),
        };

        Plate plate = new Plate(100500);

        for (Cat cat: cats) {
            cat.tryToEatFrom(plate);
        }
    }
}
