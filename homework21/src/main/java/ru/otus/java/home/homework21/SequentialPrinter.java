package ru.otus.java.home.homework21;

import java.util.ArrayList;
import java.util.List;

public class SequentialPrinter {
    public static final List<String> sequence = new ArrayList<>();
    private static final Object monitor1 = new Object();

    public static void printA() {
        synchronized (monitor1) {
            try {
                if (SequentialPrinter.sequence.isEmpty()) {
                    sequence.add("A");
                }
                for (int i = 0; i < 4 ; i++) {
                    while (!sequence.get(sequence.size() - 1).equals("C")) {
                        monitor1.wait();
                    }
                    sequence.add("A");
                    monitor1.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void printB() {
        synchronized (monitor1) {
            try {
                for (int i = 0; i < 5 ; i++) {
                    while (!sequence.get(sequence.size() - 1).equals("A")) {
                        monitor1.wait();
                    }
                    sequence.add("B");
                    monitor1.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void printC() {
        synchronized (monitor1) {
            try {
                for (int i = 0; i < 5 ; i++) {
                    while (!sequence.get(sequence.size() - 1).equals("B")) {
                        monitor1.wait();
                    }
                    sequence.add("C");
                    monitor1.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


}
