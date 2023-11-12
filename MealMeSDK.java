package com.mealme.sdk;

import com.mealme.sdk.models.Order;
import com.mealme.sdk.models.Product;
import com.mealme.sdk.network.HttpClient;

import java.util.List;

/**
 * This is the main interface for interacting with the MealMe API.
 */
public class MealMeSDK {

    private final HttpClient httpClient;

    public MealMeSDK(String apiKey) {
        this.httpClient = new HttpClient(apiKey);
    }

    /**
     * Creates an order on the MealMe platform.
     *
     * @param order The order to be created.
     * @return The created order.
     */
    public Order createOrder(Order order) {
        return httpClient.post("/orders", order, Order.class);
    }

    /**
     * Confirms an order on the MealMe platform.
     *
     * @param orderId The ID of the order to be confirmed.
     * @return The confirmed order.
     */
    public Order confirmOrder(String orderId) {
        return httpClient.put("/orders/" + orderId + "/confirm", null, Order.class);
    }

    /**
     * Retrieves a list of products from a store on the MealMe platform.
     *
     * @param storeId The ID of the store.
     * @return A list of products.
     */
    public List<Product> getStoreProducts(String storeId) {
        return httpClient.get("/stores/" + storeId + "/products", List.class);
    }
}