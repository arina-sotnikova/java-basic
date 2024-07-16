package ru.otus.java.home.homework20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileProcessor {
    public static String getFileNameFromUser(Scanner input) {
        System.out.println("Type the name of the file you want to process.");
        return input.nextLine();
    }

    public static void getNumberOfOccurrences(Scanner scanner, String fileName) throws IOException {
        System.out.println("Type the pattern to search in the file.");
        String userInput = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] buffer = fileInputStream.readAllBytes();
            String data = new String(buffer, StandardCharsets.UTF_8);

            Pattern toFind = Pattern.compile(userInput);
            Matcher match = toFind.matcher(data);
            int counter = 0;

            while (match.find()) {
                counter += 1;
            }
            System.out.println(counter);
        }
    }
}