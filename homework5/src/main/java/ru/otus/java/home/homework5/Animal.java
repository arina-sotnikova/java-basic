package ru.otus.java.home.homework5;

public abstract class Animal {
    String name;
    int runSpeed;
    int endurance;
    boolean isTired;

    public Animal(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
        this.isTired = false;
    }

    private final static int ENDURANCE_PER_RUN_DISTANCE_UNIT = 1;
    public int run(int distance) {
        if (isTired) {
            System.err.println("Животное уже устало");
            return -1;
        } else if (distance * ENDURANCE_PER_RUN_DISTANCE_UNIT > endurance) {
            this.endurance = 0;
            this.isTired = true;
            System.err.println("Животное устало по пути и не добежало до конца");
            return -1;
        } else if (distance * ENDURANCE_PER_RUN_DISTANCE_UNIT == endurance) {
            this.endurance = 0;
            this.isTired = true;
            System.err.println("Животное устало, дойдя до конца пути");
            return distance / this.runSpeed;
        } else {
            this.endurance -= distance * ENDURANCE_PER_RUN_DISTANCE_UNIT;
            System.out.printf("Животное пробежало заданную дистанцию в %d метров.%n", distance);
            return distance / this.runSpeed;
        }
    }

    public void info() {
        System.out.printf("Имя животного: %s.%n", this.name);
        System.out.printf("У животного по имени %s осталось %d единиц выносливости.%n", this.name, this.endurance);
        System.out.printf("Животное устало: %b.%n", this.isTired);
    }
}
