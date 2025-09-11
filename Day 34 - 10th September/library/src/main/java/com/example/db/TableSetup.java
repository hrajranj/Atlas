package com.example.db;





import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.model.*;
import com.example.model.Book;

import java.util.Arrays;

public class TableSetup {
    public static void createBooksTable(DynamoDB dynamoDB) {
        String tableName = "Books";

        try {
            // Check if table exists
            Table table = dynamoDB.getTable(tableName);
            table.describe();
            System.out.println("✅ Table already exists: " + tableName);
        } catch (Exception e) {
            System.out.println("⚠️ Table not found. Creating new table...");

            try {
                Table table = dynamoDB.createTable(
                        tableName,
                        Arrays.asList(new KeySchemaElement("bookId", KeyType.HASH)), // Primary key
                        Arrays.asList(new AttributeDefinition("bookId", ScalarAttributeType.S)),
                        new ProvisionedThroughput(5L, 5L)
                );
                table.waitForActive();
                System.out.println("✅ Table created successfully: " + table.getTableName());

                // Insert some sample data
                insertSampleBooks(table);
            } catch (Exception ce) {
                System.err.println("❌ Failed to create table: " + ce.getMessage());
            }
        }
    }

    private static void insertSampleBooks(Table table) {
        System.out.println("📚 Inserting sample books...");

        Book[] sampleBooks = {
                new Book("B1", "Effective Java", "Joshua Bloch", 2018),
                new Book("B2", "Clean Code", "Robert C. Martin", 2008),
                new Book("B3", "Design Patterns", "Erich Gamma", 1994)
        };

        for (Book book : sampleBooks) {
            try {
                Item item = new Item()
                        .withPrimaryKey("bookId", book.getBookId())
                        .withString("title", book.getTitle())
                        .withString("author", book.getAuthor())
                        .withNumber("year", book.getYear());
                table.putItem(item);
                System.out.println("✅ Added: " + book);
            } catch (Exception e) {
                System.err.println("❌ Failed to add book " + book.getBookId() + ": " + e.getMessage());
            }
        }
    }
}
