package ru.otus.java.home.homework8;

import ru.otus.java.home.homework8.exception.AppArrayDataException;
import ru.otus.java.home.homework8.exception.AppArraySizeException;
import ru.otus.java.home.homework8.util.ArrayProcessor;

public class MainApp {
    public static void main(String[] args) {
        try {
            int sum = ArrayProcessor.process(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "foo", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}});
            System.out.println(sum);
        } catch (AppArrayDataException | AppArraySizeException e) {
            throw new RuntimeException(e);
        }
    }
}
