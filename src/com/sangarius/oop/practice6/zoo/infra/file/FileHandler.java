package com.sangarius.oop.practice6.zoo.infra.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Handles file operations for the zoo review system.
 *
 * <p>Provides methods for reading and writing lines to a file.</p>
 *
 * @see com.sangarius.oop.practice6.zoo.service.ZooReviewService
 */
public class FileHandler {

    /**
     * The path to the file.
     */
    private final String filePath;

    /**
     * Constructs a new FileHandler with the specified file path.
     *
     * @param filePath The path to the file.
     */
    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Reads all lines from the file.
     *
     * @return A list of strings representing the lines in the file.
     * @throws IOException If an I/O error occurs.
     */
    public List<String> readLines() throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    /**
     * Writes the given lines to the file, replacing its previous content.
     *
     * @param lines The lines to be written to the file.
     * @throws IOException If an I/O error occurs.
     */
    public void writeLines(List<String> lines) throws IOException {
        Files.write(Path.of(filePath), lines);
    }
}
