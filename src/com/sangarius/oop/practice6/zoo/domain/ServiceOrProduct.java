package com.sangarius.oop.practice6.zoo.domain;

public class ServiceOrProduct {
    private String name;
    private String description;

    public ServiceOrProduct(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
