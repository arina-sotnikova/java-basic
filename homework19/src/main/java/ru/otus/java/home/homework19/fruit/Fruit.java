package ru.otus.java.home.homework19.fruit;

public abstract class Fruit implements Comparable<Fruit> {
    abstract int getWeight();

    @Override
    public final int compareTo(Fruit o) {
        return Integer.compare(this.getWeight(), o.getWeight());
    }
}
