package ru.otus.home.homework1;

import java.util.Scanner;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int numberFromUser = scanner.nextInt();
        if (numberFromUser == 1) {
            greetings();
        } else if (numberFromUser == 2) {
            int a = (int)(Math.random() * 10);
            int b = (int)(Math.random() * 10);
            int c = (int)(Math.random() * 10);
            checkSign(a, b, c);
        } else if (numberFromUser == 3) {
            selectColor();
        } else if (numberFromUser == 4) {
            compareNumbers();
        } else if (numberFromUser == 5) {
            int initValue = (int)(Math.random() * 10);
            int delta = (int)(Math.random() * 10);
            Random random = new Random();
            boolean increment = random.nextBoolean();
            addOrSubtractAndPrint(initValue, delta, increment);
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c);
        int sum = a + b + c;
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    public static void selectColor() {
        int data = (int)(Math.random() * 10);
        System.out.println("data = " + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        System.out.println("a = " + a + "\n" + "b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println(("a < b"));
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("initValue = " + initValue + "\n" + "delta = " + delta + "\n" + "increment = " + increment);
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
