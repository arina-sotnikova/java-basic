package ru.otus.home.homework7.transport;

import org.apache.commons.lang3.ArrayUtils;
import ru.otus.home.homework7.Human;
import ru.otus.home.homework7.land.Land;

import static ru.otus.home.homework7.land.Land.SWAMP;

public class Horse extends Transport {
    private int calories;
    private Human human;

    public Horse(int calories, Human human) {
        this.calories = calories;
        this.human = human;
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
        return new Land[] {SWAMP};
    }

    @Override
    public boolean move(int distance, Land landType) {
        Land[] forbiddenLand = getForbiddenLand();
        if (ArrayUtils.contains(forbiddenLand, landType))
            throw new IllegalArgumentException("The horse can not go through the " + landType);
        else if (distance > calories)
            throw new IllegalArgumentException("The horse is too tired and can not go");
        else {
            calories -= distance;
            human.setCurrentLand(landType);
            return true;
        }
    }
}
