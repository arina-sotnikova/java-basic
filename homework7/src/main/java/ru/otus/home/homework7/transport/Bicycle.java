package ru.otus.home.homework7.transport;

import org.apache.commons.lang3.ArrayUtils;
import ru.otus.home.homework7.Human;
import ru.otus.home.homework7.land.Land;


public class Bicycle extends Transport {
    private Human human;

    public Bicycle(Human driver) {
        this.human = driver;
    }

    @Override
    public Land[] getForbiddenLand() {
        return new Land[] {Land.SWAMP};
    }

    @Override
    public boolean move(int distance, Land landType) {
        Land[] forbiddenLand = getForbiddenLand();
        if (ArrayUtils.contains(forbiddenLand, landType))
            throw new IllegalArgumentException("A bike can not ride through the " + landType);
        else if (distance > human.getAmountOfAvailableEnergy())
            throw new IllegalArgumentException("The human does not have enough energy to ride a bike");
        else {
            human.decreaseBy(distance);
            human.setCurrentLand(landType);
            return true;
        }
    }
}
