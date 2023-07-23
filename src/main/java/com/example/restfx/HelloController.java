package com.example.restfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ListView<String> userListView;

    private static final String API_URL = "http://localhost:8080/users";

    @FXML
    protected void onLoadDataButtonClick() {
        try {
            List<User> users = fetchDataFromAPI();
            welcomeText.setText("Data loaded successfully! Total data: " + users.size());
            displayUserData(users);
        } catch (IOException e) {
            e.printStackTrace();
            welcomeText.setText("Error while fetching data!");
        }
    }

    private List<User> fetchDataFromAPI() throws IOException {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        Gson gson = new Gson();
        JsonElement jsonElement = JsonParser.parseString(response.toString());
        if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            Type listType = new TypeToken<List<User>>() {}.getType();
            return gson.fromJson(jsonArray, listType);
        } else {
            throw new JsonSyntaxException("Invalid JSON format: Expected JSON array.");
        }
    }

    private void displayUserData(List<User> users) {
        userListView.getItems().clear();
        for (User user : users) {
            String userInfo = "ID: " + user.getId() + ", Name: " + user.getName() + ", Age: " + user.getAge() + ", Email: " + user.getEmail();
            userListView.getItems().add(userInfo);
        }
    }
}
