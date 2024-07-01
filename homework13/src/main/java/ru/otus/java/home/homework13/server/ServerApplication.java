package ru.otus.java.home.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApplication {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Client has connected");
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
            out.writeUTF("+/-/*");
            processRequest(client);
        }
    }

    public static void processRequest(Socket client) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String userInput = in.readLine();
        System.out.printf("Original: %s \n", userInput);
        int result = calculate(userInput);
        System.out.printf("Result: %s \n", result);
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(String.valueOf(result));
        out.flush();
    }

    private static int calculate(String message) {
        String[] operators = message.split("[0-9]+");
        String[] operands = message.split("[-|+|\\*|\\/]");
        int agregate = Integer.parseInt(operands[0]);
        for(int i = 1; i < operands.length; i++){
            switch (operators[i]) {
                case "+":
                agregate += Integer.parseInt(operands[i]);
                case "-":
                    agregate -= Integer.parseInt(operands[i]);
                    break;
                case "*":
                    agregate *= Integer.parseInt(operands[i]);
                    break;
                case "/":
                    agregate /= Integer.parseInt(operands[i]);
                    break;
            }
        }
        return agregate;
    }
}
