package ru.otus.java.home.homework12.filesprocessing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FilesProcessor {
    public static void getFiles(File dir) {
        File[] filesList = dir.listFiles();
        if (filesList == null) throw new AssertionError();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }


    public static String getFileNameFromUser() {
        System.out.println("Choose a file to work with.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static void getContentsOfChosenFile(String fileName) {
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(fileName))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeTextFromUserIntoFile(String fileName) {
        Scanner scanner = new Scanner(System.in);
        String textToWrite = scanner.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            byte[] buffer = textToWrite.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

