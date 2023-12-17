package com.sangarius.oop.practice6.zoo.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Username:" + username;
    }
}