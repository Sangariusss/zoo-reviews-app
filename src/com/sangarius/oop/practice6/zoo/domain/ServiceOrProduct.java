package com.sangarius.oop.practice6.zoo.domain;

import java.io.Serializable;

/**
 * Represents a service or product in the zoo review system.
 *
 * <p>A service or product has a name and a description.</p>
 *
 * @see Review
 */
public class ServiceOrProduct implements Serializable {

    /**
     * The name of the service or product.
     */
    private String name;

    /**
     * The description of the service or product.
     */
    private String description;

    /**
     * Constructs a new ServiceOrProduct with the specified name and description.
     *
     * @param name        The name of the service or product.
     * @param description The description of the service or product.
     */
    public ServiceOrProduct(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Gets the name of the service or product.
     *
     * @return The name of the service or product.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the service or product.
     *
     * @return The description of the service or product.
     */
    public String getDescription() {
        return description;
    }
}
