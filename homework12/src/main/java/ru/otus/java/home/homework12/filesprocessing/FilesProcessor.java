package ru.otus.java.home.homework12.filesprocessing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesProcessor {
    public static void getFiles(Path directoryPath) {
        try (Stream<Path> stream = Files.list(directoryPath)) {
            Set<String> files = stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
            System.out.println(files);
        } catch (IOException e) {
            throw new RuntimeException(e);
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

