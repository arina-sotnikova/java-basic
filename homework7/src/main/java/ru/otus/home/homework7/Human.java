package ru.otus.home.homework7;

import ru.otus.home.homework7.land.Land;

public class Human {
    private final String name;
    private int availableCalories;
    private Land currentLand;

    public Human(String name, int availableCalories, Land currentLand) {
        this.name = name;
        this.availableCalories = availableCalories;
        this.currentLand = currentLand;
    }

    public void setCurrentLand(Land currentLand) {
        this.currentLand = currentLand;
    }

    public Land getCurrentLand() {
        return currentLand;
    }

    public int getAmountOfAvailableEnergy() {
        return availableCalories;
    }

    public void decreaseBy(int amount) {
        if (amount > availableCalories)
            throw new IllegalArgumentException("The human does not have enough energy to move");
        else
            availableCalories -= amount;
    }
}
