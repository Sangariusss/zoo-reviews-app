package com.sangarius.oop.practice6.zoo.infra.serialization;

import java.io.*;

/**
 * Handles serialization and deserialization operations for the zoo review system.
 *
 * <p>Provides methods for serializing and deserializing objects to and from a file.</p>
 *
 * @see com.sangarius.oop.practice6.zoo.service.ZooReviewService
 */
public class SerializationHandler {

    /**
     * The path to the file for serialization/deserialization.
     */
    private final String filePath;

    /**
     * Constructs a new SerializationHandler with the specified file path.
     *
     * @param filePath The path to the file for serialization/deserialization.
     */
    public SerializationHandler(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Deserializes an object of the specified class from the file.
     *
     * @param clazz The class of the object to be deserialized.
     * @param <T>   The type of the object to be deserialized.
     * @return The deserialized object.
     * @throws IOException            If an I/O error occurs.
     * @throws ClassNotFoundException If the class of the object to be deserialized is not found.
     */
    public <T> T deserialize(Class<T> clazz) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return clazz.cast(objectInputStream.readObject());
        }
    }

    /**
     * Serializes the given object to the file.
     *
     * @param object The object to be serialized.
     * @throws IOException If an I/O error occurs.
     */
    public void serialize(Object object) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(object);
        }
    }
}
