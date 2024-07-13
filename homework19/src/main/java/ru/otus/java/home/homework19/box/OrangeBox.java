package ru.otus.java.home.homework19.box;

import ru.otus.java.home.homework19.fruit.Orange;

public class OrangeBox extends Box<Orange> {

    public OrangeBox() {
        super();
    }

    @Override
    int weight() {
        return getContents().size();
    }
}