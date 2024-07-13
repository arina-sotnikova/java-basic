package ru.otus.java.home.homework14;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class ArrayProcessor {
    public static double[] createArray() {
        Random random = new Random();
        return random.doubles(100_000_000, 1,1000).toArray();
    }
    public static void processArrayWith1Thread(double[] array) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time with 1 thread: " + formatter.format((end - start) / 1000d) + " seconds. \n");
    }

    public static void processArrayWith4Threads(double[] array) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array[25_000_000]; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t2 = new Thread(() -> {
            double[] arr = Arrays.copyOfRange(array,25_000_000,49_999_999);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t3 = new Thread(() -> {
            double[] arr = Arrays.copyOfRange(array,50_000_000,74_999_999);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t4 = new Thread(() -> {
            double[] arr = Arrays.copyOfRange(array,75_000_000,99_999_999);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        try {
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time with 4 threads: " + formatter.format((end - start) / 1000d) + " seconds.");
    }


}
