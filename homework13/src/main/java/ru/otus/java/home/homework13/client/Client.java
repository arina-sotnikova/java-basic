package ru.otus.java.home.homework13.client;

import java.io.*;
import java.net.Socket;

public class Client {
    private final DataInputStream in;
    private final DataOutputStream out;

    public Client(Socket socket) throws IOException {
        this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String message) throws IOException {
        out.write(message.getBytes());
        out.flush();
    }

    public String read() throws IOException {
        return in.readUTF();
    }
}
