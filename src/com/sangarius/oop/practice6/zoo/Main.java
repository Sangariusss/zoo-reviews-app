package com.sangarius.oop.practice6.zoo;

import com.sangarius.oop.practice6.zoo.domain.Review;
import com.sangarius.oop.practice6.zoo.domain.ServiceOrProduct;
import com.sangarius.oop.practice6.zoo.domain.User;
import com.sangarius.oop.practice6.zoo.infra.serialization.SerializationHandler;
import com.sangarius.oop.practice6.zoo.service.ZooReviewService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * The main class to run the zoo review system application.
 *
 * <p>This class demonstrates the serialization and deserialization of a ZooReviewService
 * object along with the addition of users, services/products, and reviews.</p>
 *
 * @see com.sangarius.oop.practice6.zoo.domain.Review
 * @see com.sangarius.oop.practice6.zoo.domain.ServiceOrProduct
 * @see com.sangarius.oop.practice6.zoo.domain.User
 * @see com.sangarius.oop.practice6.zoo.infra.serialization.SerializationHandler
 * @see com.sangarius.oop.practice6.zoo.service.ZooReviewService
 */
public class Main {

    /**
     * The entry point of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        SerializationHandler serializationHandler = new SerializationHandler("data.txt");
        ZooReviewService zooReviewService = new ZooReviewService();

        User johnDoe = new User("John Doe");
        User anotherUser = new User("Another User");

        ServiceOrProduct lionEncounter = new ServiceOrProduct("Lion Encounter", "An interactive lion experience");
        ServiceOrProduct giraffeEncounter = new ServiceOrProduct("Giraffe Encounter", "A chance to interact with giraffes");

        // Creating and adding the first review to the service directly
        zooReviewService.addReview(new Review(johnDoe, lionEncounter, "Awesome experience!"));

        // Creating and adding the second review to the service directly
        zooReviewService.addReview(new Review(anotherUser, giraffeEncounter, "Great interaction with giraffes!"));

        try {
            // Serializing the service
            serializationHandler.serialize(zooReviewService);

            // Deserializing the service
            ZooReviewService deserializedService = serializationHandler.deserialize(ZooReviewService.class);

            // Displaying the deserialized objects
            System.out.println("Deserialized Users: " + deserializedService.getAllUsers());
            System.out.println("Deserialized Services/Products: " + deserializedService.getAllServicesOrProducts());
            System.out.println("Deserialized Reviews: " + deserializedService.getAllReviews());

            // Writing deserialized user to a text file
            writeToTextFile(deserializedService.getAllReviews().get(0), "deserializedData.txt");
            writeToTextFile(deserializedService.getAllReviews().get(1), "deserializedData.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes the content of a review to a text file.
     *
     * @param review   The review to write to the file.
     * @param filePath The path of the file to write the review content.
     * @throws IOException If an I/O error occurs.
     */
    private static void writeToTextFile(Review review, String filePath) throws IOException {
        String content = buildReviewContent(review);
        Files.writeString(Path.of(filePath), content);
        System.out.println("Data written to " + filePath);
    }

    /**
     * Builds a string representation of the review content.
     *
     * @param review The review for which to build the content string.
     * @return The string representation of the review content.
     */
    private static String buildReviewContent(Review review) {
        User user = review.getUser();
        ServiceOrProduct serviceOrProduct = review.getServiceOrProduct();
        String comment = review.getComment();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User: ").append(user.getUsername()).append("\n");
        stringBuilder.append("Service/Product: ").append(serviceOrProduct.getName()).append("\n");
        stringBuilder.append("Comment: ").append(comment);

        return stringBuilder.toString();
    }
}