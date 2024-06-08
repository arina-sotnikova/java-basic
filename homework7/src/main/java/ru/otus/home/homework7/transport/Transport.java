package ru.otus.home.homework7.transport;

import ru.otus.home.homework7.land.Land;

abstract class Transport {

    public abstract boolean move(int distance, Land landType);
    public abstract Land[] getForbiddenLand();
}
