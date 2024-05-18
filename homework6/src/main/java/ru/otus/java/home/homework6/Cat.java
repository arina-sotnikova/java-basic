package ru.otus.java.home.homework6;

public class Cat {
    private final String name;
    private final int stomachVolume;
    private boolean isFull;

    public Cat(String name, int stomachVolume) {
        this.name = name;
        this.stomachVolume = stomachVolume;
        this.isFull = false;
    }


    public String getName() {
        return name;
    }

    public int getStomachVolume() {
        return stomachVolume;
    }

    public boolean isFull() {
        return isFull;
    }

    public void tryToEatFrom(Plate plate) {
        if (plate.getCurrentFoodAmount() >= stomachVolume) {
            isFull = true;
            plate.decreaseFoodAmount(stomachVolume);
            System.out.printf("Success. The cat %s is full now.%n", name);
            System.out.printf("There are %d units of food left.%n", plate.getCurrentFoodAmount());
        } else
            System.err.printf("Not enough food for %s.%n", name);
    }

    public void getInfo() {
        System.out.printf("Name: %s.%n", name);
        System.out.printf("Cat's appetite: %d.%n", stomachVolume);
        System.out.printf("Is full: %b.%n", isFull);
    }

}
