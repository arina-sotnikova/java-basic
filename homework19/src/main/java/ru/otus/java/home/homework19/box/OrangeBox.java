package ru.otus.java.home.homework19.box;

import ru.otus.java.home.homework19.fruit.Orange;

import java.util.ArrayList;
import java.util.List;

public class OrangeBox extends Box<Orange> {
    private final List<Orange> contents;

    public OrangeBox() {
        this.contents = new ArrayList<>();
    }

    @Override
    int weight() {
        return contents.size();
    }

    @Override
    public List<Orange> getAsCollection() {
        return contents;
    }

    @Override
    public void put(Orange that) {
        contents.add(that);
    }

    @Override
    public Orange extract() {
        return contents.remove(0);
    }
}
