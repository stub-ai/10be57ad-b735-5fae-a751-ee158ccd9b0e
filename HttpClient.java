package com.mealme.sdk.network;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * This class handles the HTTP requests to the MealMe API.
 */
public class HttpClient {

    private final String apiKey;
    private final Gson gson;

    public HttpClient(String apiKey) {
        this.apiKey = apiKey;
        this.gson = new Gson();
    }

    public <T> T get(String endpoint, Class<T> responseType) {
        // Implement GET request
    }

    public <T> T post(String endpoint, Object requestBody, Class<T> responseType) {
        // Implement POST request
    }

    public <T> T put(String endpoint, Object requestBody, Class<T> responseType) {
        // Implement PUT request
    }

    // Other methods for DELETE, PATCH, etc. can be added here
}