package com.sublease.subleasefinder.services;

import java.util.Map;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import io.github.cdimascio.dotenv.Dotenv;

public class MongoDBConnection {
    static Map<String, String> env = System.getenv();
    private static MongoDatabase db = dbConnector();
    
    public static MongoDatabase getDb() {
        return db;
    }

    public static MongoDatabase dbConnector() {
        Dotenv dotenv = Dotenv.load();
        String userName = dotenv.get("USER_NAME");
        String dbPassword = dotenv.get("DB_PASSWORD");
        String connectionString = "mongodb+srv://" + userName + ":" + dbPassword + "@sublease.e5ie8.mongodb.net/?retryWrites=true&w=majority&appName=sublease";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        MongoDatabase database = null;
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                database = mongoClient.getDatabase("admin");
                database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
        return database;
    }

}
