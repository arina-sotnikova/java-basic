package ru.otus.java.home.homework20;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("homework20","src","main","java","ru","otus","java","home","homework20");
        String fileSeparator = File.separator;

        try (Scanner scanner = new Scanner(System.in)) {
            String fileNameFromUser = FileProcessor.getFileNameFromUser(scanner);
            String filePath = directoryPath + fileSeparator + fileNameFromUser;


            try {
                FileProcessor.getNumberOfOccurrences(scanner, filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
