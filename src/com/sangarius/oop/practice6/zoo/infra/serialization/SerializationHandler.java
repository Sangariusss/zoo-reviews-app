package com.sangarius.oop.practice6.zoo.infra.serialization;

import java.io.*;

public class SerializationHandler {

    private final String filePath;

    public SerializationHandler(String filePath) {
        this.filePath = filePath;
    }

    public <T> T deserialize(Class<T> clazz) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return clazz.cast(objectInputStream.readObject());
        }
    }

    public void serialize(Object object) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(object);
        }
    }
}