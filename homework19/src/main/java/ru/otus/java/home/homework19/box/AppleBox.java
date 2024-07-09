package ru.otus.java.home.homework19.box;

import ru.otus.java.home.homework19.fruit.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleBox extends Box<Apple> {
    private final List<Apple> contents;

    public AppleBox() {
        this.contents = new ArrayList<>();
    }

    @Override
    int weight() {
        return contents.size();
    }

    @Override
    public List<Apple> getAsCollection() {
        return contents;
    }

    @Override
    public void put(Apple that) {
        contents.add(that);
    }

    @Override
    public Apple extract() {
        return contents.remove(0);
    }
}
