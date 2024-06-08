package ru.otus.home.homework7.transport;

import org.apache.commons.lang3.ArrayUtils;
import ru.otus.home.homework7.Human;
import ru.otus.home.homework7.land.Land;

public class OnFoot extends Transport {
    private Human human;

    public OnFoot(Human human) {
        this.human = human;
    }

    @Override
    public Land[] getForbiddenLand() {
        return new Land[] {Land.SWAMP};
    }

    @Override
    public boolean move(int distance, Land landType) {
        Land[] forbiddenLand = getForbiddenLand();
        if (ArrayUtils.contains(forbiddenLand, landType))
            throw new IllegalArgumentException("The human can not go through the " + landType);
        else if (human.getAmountOfAvailableEnergy() < distance)
            throw new IllegalArgumentException("The human does not have enough energy to go");
        else {
            human.decreaseBy(distance);
            human.setCurrentLand(landType);
            return true;
        }
    }
}
