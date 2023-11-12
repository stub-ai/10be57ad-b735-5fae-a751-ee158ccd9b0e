package com.mealme.sdk;

import java.io.IOException;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MealMeAPI {
    private static final String BASE_URL = "https://api.mealme.com/";
    private OkHttpClient client;
    private Gson gson;

    public MealMeAPI() {
        this.client = new OkHttpClient();
        this.gson = new Gson();
    }

    public List<Product> getStoreProducts(String storeId) throws IOException {
        Request request = new Request.Builder()
            .url(BASE_URL + "stores/" + storeId + "/products")
            .build();

        Response response = client.newCall(request).execute();
        return gson.fromJson(response.body().string(), new TypeToken<List<Product>>(){}.getType());
    }

    public Order createOrder(Order order) throws IOException {
        // Implement the HTTP POST request to create an order
        // Parse the response to an Order object and return
    }

    public Order confirmOrder(String orderId) throws IOException {
        // Implement the HTTP POST request to confirm an order
        // Parse the response to an Order object and return
    }
}