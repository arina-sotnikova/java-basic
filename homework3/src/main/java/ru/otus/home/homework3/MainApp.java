package ru.otus.home.homework3;

import java.util.Arrays;

public class MainApp {
    public static int sumOfPositiveElements(int[][] array) {
        return Arrays.stream(array).map(Arrays::stream).mapToInt(str -> str.filter(num -> num > 0).sum()).sum();
    }

    public static void printSquare(int size) {
        char charDefault = '*';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(charDefault);
            }
            System.out.println();
        }
    }

    public static int[][] fill2DArrayWithZeros(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    array[i][j] = 0;
            }
        }
        return array;
    }

    public static int findMax(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        } return maxValue;
    }

    public static int sumSecondRowElements(int[][] array) {
        int sum = 0;
        if (array.length >= 2) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 1)
                        sum += array[i][j];
                }
            }
        } else
            return -1;
        return sum;
    }
}
