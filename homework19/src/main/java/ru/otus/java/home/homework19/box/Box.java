package ru.otus.java.home.homework19.box;

import java.util.List;

abstract class Box<T extends Comparable<?>> {
    abstract int weight();
    public abstract List<T> getAsCollection();
    public abstract void put(T that);
    public abstract T extract();
    public <S extends Comparable<?>> boolean compare(Box<S> that) {
        return this.getAsCollection().size() == that.getAsCollection().size();
    }
}
