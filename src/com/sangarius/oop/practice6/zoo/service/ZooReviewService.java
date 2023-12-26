package com.sangarius.oop.practice6.zoo.service;

import com.sangarius.oop.practice6.zoo.domain.Review;
import com.sangarius.oop.practice6.zoo.domain.ServiceOrProduct;
import com.sangarius.oop.practice6.zoo.domain.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides services and business logic for the zoo review system.
 *
 * <p>This class manages reviews, users, and services/products.</p>
 *
 * @see com.sangarius.oop.practice6.zoo.infra.file.FileHandler
 * @see com.sangarius.oop.practice6.zoo.infra.serialization.SerializationHandler
 * @see com.sangarius.oop.practice6.zoo.domain.Review
 * @see com.sangarius.oop.practice6.zoo.domain.User
 * @see com.sangarius.oop.practice6.zoo.domain.ServiceOrProduct
 */
public class ZooReviewService implements Serializable {

    private List<User> users;
    private List<ServiceOrProduct> servicesOrProducts;
    private List<Review> reviews;

    public ZooReviewService() {
        this.users = new ArrayList<>();
        this.servicesOrProducts = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    /**
     * Adds a user to the system.
     *
     * @param user The user to be added.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Adds a service or product to the system.
     *
     * @param serviceOrProduct The service or product to be added.
     */
    public void addServiceOrProduct(ServiceOrProduct serviceOrProduct) {
        servicesOrProducts.add(serviceOrProduct);
    }

    /**
     * Adds a review to the system.
     *
     * @param review The review to be added.
     */
    public void addReview(Review review) {
        reviews.add(review);
    }

    /**
     * Gets all users in the system.
     *
     * @return The list of users in the system.
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    /**
     * Gets all services or products in the system.
     *
     * @return The list of services or products in the system.
     */
    public List<ServiceOrProduct> getAllServicesOrProducts() {
        return new ArrayList<>(servicesOrProducts);
    }

    /**
     * Gets all reviews in the system.
     *
     * @return The list of reviews in the system.
     */
    public List<Review> getAllReviews() {
        return new ArrayList<>(reviews);
    }
}
