package ru.otus.java.home.homework19.box;

import ru.otus.java.home.homework19.fruit.Apple;

public class AppleBox extends Box<Apple> {

    public AppleBox() {
        super();
    }

    @Override
    int weight() {
        return getContents().size();
    }
}