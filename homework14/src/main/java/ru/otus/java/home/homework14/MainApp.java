package ru.otus.java.home.homework14;

public class MainApp {
    public static void main(String[] args) {
        double[] arr = ArrayProcessor.createArray();
        ArrayProcessor.processArrayWith1Thread(arr);
        ArrayProcessor.processArrayWith4Threads(arr);
    }
}
