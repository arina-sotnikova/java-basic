package ru.otus.java.home.homework6;

public class Plate {
    private final int maxVolume;
    private int currentFoodAmount;

    public Plate(int maxVolume) {
        this.maxVolume = maxVolume;
        this.currentFoodAmount = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public void addFood(int amount) {
        if (currentFoodAmount + amount <= maxVolume)
            currentFoodAmount += amount;
         else
            throw new IllegalArgumentException("Trying to add too much food");
    }

    public boolean decreaseFoodAmount(int amount) {
        if (currentFoodAmount - amount < 0)
            return false;
        currentFoodAmount -= amount;
        return true;
    }
}
