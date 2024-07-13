package ru.otus.java.home.homework19.fruit;

public class Apple extends Fruit {
    private final int weight;

    public Apple() {
        this.weight = 1;
    }
    @Override
    int getWeight() {
        return weight;
    }
}
