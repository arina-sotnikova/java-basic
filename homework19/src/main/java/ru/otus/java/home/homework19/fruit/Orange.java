package ru.otus.java.home.homework19.fruit;

public class Orange extends Fruit {
    private final int weight;

    public Orange() {
        this.weight = 1;
    }
    @Override
    int getWeight() {
        return weight;
    }
}
