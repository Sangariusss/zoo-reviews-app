package com.sangarius.oop.practice6.zoo.domain;

public class Review {
    private User user;
    private ServiceOrProduct serviceOrProduct;
    private String comment;

    public Review(User user, ServiceOrProduct serviceOrProduct, String comment) {
        this.user = user;
        this.serviceOrProduct = serviceOrProduct;
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public ServiceOrProduct getServiceOrProduct() {
        return serviceOrProduct;
    }

    public String getComment() {
        return comment;
    }
}
