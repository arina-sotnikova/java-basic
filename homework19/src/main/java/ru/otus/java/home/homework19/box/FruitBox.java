package ru.otus.java.home.homework19.box;

import ru.otus.java.home.homework19.fruit.Fruit;

public class FruitBox extends Box<Fruit> {

    public FruitBox() {
        super();
    }

    @Override
    int weight() {
        return getContents().size();
    }
}