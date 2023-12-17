package com.sangarius.oop.practice6.zoo.infra.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {

    private final String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public List<String> readLines() throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    public void writeLines(List<String> lines) throws IOException {
        Files.write(Path.of(filePath), lines);
    }
}
