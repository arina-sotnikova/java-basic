package ru.otus.java.home.homework19.box;

import ru.otus.java.home.homework19.fruit.Apple;
import ru.otus.java.home.homework19.fruit.Fruit;
import ru.otus.java.home.homework19.fruit.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FruitBox extends Box<Fruit> {
    private final List<Fruit> contents;

    public FruitBox() {
        this.contents = new ArrayList<>();
    }


    @Override
    int weight() {
        return contents.size();
    }

    @Override
    public List<Fruit> getAsCollection() {
        return contents;
    }

    @Override
    public void put(Fruit that) {
        contents.add(that);
    }

    @Override
    public Fruit extract() {
        return contents.remove(0);
    }

    public Optional<Apple> extractApple() {
        for (int i = 0; i < contents.size(); i++) {
            if (contents.get(i) instanceof Apple) {
                return Optional.of((Apple) contents.remove(i));
            }
        }
        return Optional.empty();
    }

    public Optional<Orange> extractOrange() {
        for (int i = 0; i < contents.size(); i++) {
            if (contents.get(i) instanceof Apple) {
                return Optional.of((Orange) contents.remove(i));
            }
        }
        return Optional.empty();
    }
}
