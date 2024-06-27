package ru.otus.java.home.homework12.filesprocessing;

import java.io.File;

public class MainApp {
    public static void main(String[] args) {
        File dirPath = new File("homework12\\src\\main\\java\\ru\\otus\\java\\home\\homework12");
        FilesProcessor.getFiles(dirPath);
        String fileChosenByUser = FilesProcessor.getFileNameFromUser();
        String filePath = dirPath + "\\" + fileChosenByUser;
        FilesProcessor.getContentsOfChosenFile(filePath);
        FilesProcessor.writeTextFromUserIntoFile(filePath);
    }
}

