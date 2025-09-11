package com.example.db;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

public class DatabaseConnection {
    private static DynamoDB dynamoDB;

    private DatabaseConnection() {}

    public static DynamoDB getInstance() {
        if (dynamoDB == null) {
           
            AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(
                        "http://localhost:8000", // Local DynamoDB or NoSQL Workbench
                        "us-west-2"))
                .build();

            dynamoDB = new DynamoDB(client);
        }
        return dynamoDB;
    }
}
