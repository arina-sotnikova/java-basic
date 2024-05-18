package ru.otus.java.home.homework5;

public class Dog extends Animal implements SwimmingCapability {
    private final int swimSpeed;
    public Dog(String name, int runSpeed, int endurance, int swimSpeed) {
        super(name, runSpeed, endurance);
        this.swimSpeed = swimSpeed;
    }

    private final static int ENDURANCE_PER_SWIM_DISTANCE_UNIT = 2;
    @Override
    public int swim(int distance) {
        if (isTired) {
            System.err.printf("Собачка %s уже устала.%n", this.name);
            return -1;
        } else if (distance * ENDURANCE_PER_SWIM_DISTANCE_UNIT > endurance) {
            this.endurance = 0;
            this.isTired = true;
            System.err.printf("Собачка %s устала по пути, и ее нужно спасать :(", this.name);
            return -1;
        } else if (distance * ENDURANCE_PER_SWIM_DISTANCE_UNIT == endurance) {
            this.endurance = 0;
            this.isTired = true;
            System.err.printf("Собачка %s устала, едва доплыв до берега", this.name);
            return distance / this.swimSpeed;
        } else {
            this.endurance -= distance * ENDURANCE_PER_SWIM_DISTANCE_UNIT;
            System.out.printf("Собачка %s проплыла заданную дистанцию в %d метров.%n", this.name, distance);
            return distance / this.swimSpeed;
        }
    }
}
