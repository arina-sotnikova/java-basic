package ru.otus.java.home.homework19.box;

import java.util.ArrayList;
import java.util.List;

abstract class Box<T extends Comparable<?>> {
    abstract int weight();

    private final List<T> contents;

    Box() {
        this.contents = new ArrayList<>();
    }

    public final List<T> getContents() {
        return contents;
    }


    public final void put(T that) {
        contents.add(that);
    }

    public final T extract() {
        return contents.remove(0);
    }

    public final void putIn(Box<? super T> anotherBox) {
        for (int i = 0; i < contents.size(); i++) {
            anotherBox.put(extract());
        }
    }

    public final <S extends Comparable<?>> boolean compare(Box<S> that) {
        return this.getContents().size() == that.getContents().size();
    }
}
