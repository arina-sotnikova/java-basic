package ru.otus.home.homework7.transport;

import org.apache.commons.lang3.ArrayUtils;
import ru.otus.home.homework7.Human;
import ru.otus.home.homework7.land.Land;

public class Car extends Transport{
    private int gasoline;
    private Human human;

    public Car(int gasoline, Human driver) {
        this.gasoline = gasoline;
        this.human = driver;
    }

    public boolean setDriver(Human driver) {
        if (this.human == null) {
            this.human = driver;
            return true;
        }
        else if (driver == null) {
            this.human = null;
            return true;
        }
        else return false;
    }

    @Override
    public Land[] getForbiddenLand() {
        return new Land[] {Land.SWAMP, Land.FOREST};
    }

    @Override
    public boolean move(int distance, Land landType) {
        Land[] forbiddenLand = getForbiddenLand();
        if (ArrayUtils.contains(forbiddenLand, landType))
            throw new IllegalArgumentException("The car can not ride through the " + landType);
        else if (distance > gasoline)
            throw new IllegalArgumentException("There is not enough gasoline in the car");
        else {
            human.setCurrentLand(landType);
            gasoline -= distance;
            return true;
        }
    }
}
