package ru.otus.java.home.homework21;

public class MainApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(SequentialPrinter::printA);
        Thread t2 = new Thread(SequentialPrinter::printB);
        Thread t3 = new Thread(SequentialPrinter::printC);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            System.out.println(SequentialPrinter.sequence);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
