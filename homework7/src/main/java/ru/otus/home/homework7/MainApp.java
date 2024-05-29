package ru.otus.home.homework7;

import ru.otus.home.homework7.land.Land;
import ru.otus.home.homework7.transport.*;

public class MainApp {
    public static void main(String[] args) {
        Human human1 = new Human("Lord Byron", 2500, Land.PLAIN);
        Car car = new Car(100, human1);
        car.move(50, human1.getCurrentLand());
        Bicycle bike = new Bicycle(human1);
        human1.setCurrentLand(Land.FOREST);
        bike.move(300, human1.getCurrentLand());
        OnFoot onFoot = new OnFoot(human1);
        onFoot.move(500, human1.getCurrentLand());
        human1.setCurrentLand(Land.SWAMP);
        AllTerrainVehicle atv = new AllTerrainVehicle(700, human1);
        atv.move(500, human1.getCurrentLand());

        Human human2 = new Human("Rainer Maria Rilke", 2000, Land.FOREST);
        atv.setDriver(human2);
        atv.move(100, human2.getCurrentLand());
        human2.setCurrentLand(Land.SWAMP);
        Horse horse = new Horse(3000, human2);
        horse.move(250, human2.getCurrentLand());
    }
}
