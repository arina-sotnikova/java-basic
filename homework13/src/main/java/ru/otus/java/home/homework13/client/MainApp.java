package ru.otus.java.home.homework13.client;

import java.net.Socket;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        try (Socket socket = new Socket("localhost", 8888)) {
            Client pingClient = new Client(socket);
            pingClient.send(userInput + "\n");
            String result = pingClient.read();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
