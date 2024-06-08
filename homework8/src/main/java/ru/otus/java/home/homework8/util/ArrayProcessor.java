package ru.otus.java.home.homework8.util;

import ru.otus.java.home.homework8.exception.AppArrayDataException;
import ru.otus.java.home.homework8.exception.AppArraySizeException;

public class ArrayProcessor {
    public static int process(String[][] array) throws AppArrayDataException, AppArraySizeException {
        if (array.length != 4 || array[0].length != 4)
            throw new AppArraySizeException(String.format("Invalid array size: %d x %d", array.length, array[0].length));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(e.getMessage() + String.format(" at position %d x %d", i, j));
                }
            }
        }
        return sum;
    }
}
