package com.sangarius.oop.practice6.zoo.domain;

import java.io.Serializable;

/**
 * Represents a user of the zoo review system.
 *
 * <p>A user has a unique username.</p>
 *
 * @see Review
 * @see Serializable
 */
public class User implements Serializable {

    /**
     * The unique username of the user.
     */
    private String username;

    /**
     * Constructs a new User with the specified username.
     *
     * @param username The unique username of the user.
     */
    public User(String username) {
        this.username = username;
    }

    /**
     * Gets the username of the user.
     *
     * @return The unique username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return A string representation of the user.
     */
    @Override
    public String toString() {
        return "Username: " + username;
    }
}
