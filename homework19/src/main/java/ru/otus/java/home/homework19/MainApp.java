package ru.otus.java.home.homework19;

import ru.otus.java.home.homework19.box.AppleBox;
import ru.otus.java.home.homework19.box.FruitBox;
import ru.otus.java.home.homework19.box.OrangeBox;
import ru.otus.java.home.homework19.fruit.Apple;
import ru.otus.java.home.homework19.fruit.Orange;

public class MainApp {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Apple apple1 = new Apple();

        OrangeBox orangeBox1 = new OrangeBox();
        orangeBox1.put(orange1);

        OrangeBox orangeBox2 = new OrangeBox();
        orangeBox2.put(orange2);
        orangeBox2.put(orange3);

        System.out.println(orangeBox1.compare(orangeBox2));

        orangeBox1.putIn(orangeBox2);

        System.out.println(orangeBox1.compare(orangeBox2));

        FruitBox fruitBox = new FruitBox();
        AppleBox appleBox = new AppleBox();
        fruitBox.put(apple1);
        appleBox.putIn(fruitBox);
        System.out.println(fruitBox.compare(appleBox));
        appleBox.put(apple1);
        System.out.println(appleBox.compare(fruitBox));

    }
}
