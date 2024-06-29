package ru.otus.java.home.homework12.filesprocessing;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("homework12","src","main","java","ru","otus","java","home","homework12");
        FilesProcessor.getFiles(directoryPath);
        String fileChosenByUser = FilesProcessor.getFileNameFromUser();
        String fileSeparator = File.separator;
        String filePath = directoryPath + fileSeparator + fileChosenByUser;
        FilesProcessor.getContentsOfChosenFile(filePath);
        FilesProcessor.writeTextFromUserIntoFile(filePath);
    }
}

