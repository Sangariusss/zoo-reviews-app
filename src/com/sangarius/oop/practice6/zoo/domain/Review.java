package com.sangarius.oop.practice6.zoo.domain;

import java.io.Serializable;

/**
 * Represents a review in the zoo review system.
 *
 * <p>A review is associated with a user, a service or product, and contains a comment.</p>
 *
 * @see User
 * @see ServiceOrProduct
 */
public class Review implements Serializable {

    /**
     * The user who wrote the review.
     */
    private User user;

    /**
     * The service or product associated with the review.
     */
    private ServiceOrProduct serviceOrProduct;

    /**
     * The comment provided in the review.
     */
    private String comment;

    /**
     * Constructs a new Review with the specified user, service or product, and comment.
     *
     * @param user              The user who wrote the review.
     * @param serviceOrProduct The service or product associated with the review.
     * @param comment           The comment provided in the review.
     */
    public Review(User user, ServiceOrProduct serviceOrProduct, String comment) {
        this.user = user;
        this.serviceOrProduct = serviceOrProduct;
        this.comment = comment;
    }

    /**
     * Gets the user who wrote the review.
     *
     * @return The user who wrote the review.
     */
    public User getUser() {
        return user;
    }

    /**
     * Gets the service or product associated with the review.
     *
     * @return The service or product associated with the review.
     */
    public ServiceOrProduct getServiceOrProduct() {
        return serviceOrProduct;
    }

    /**
     * Gets the comment provided in the review.
     *
     * @return The comment provided in the review.
     */
    public String getComment() {
        return comment;
    }
}
