package com.example.service;



import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.example.db.DatabaseConnection;
import com.example.model.Book;

import java.util.*;

public class BookService {
    private final Table table;

    public BookService(String tableName) {
        DynamoDB dynamoDB = DatabaseConnection.getInstance();
        this.table = dynamoDB.getTable(tableName);
    }

    /** Create or Insert a new book */
    public void addBook(Book book) {
        try {
            Item item = new Item()
                    .withPrimaryKey("bookId", book.getBookId())
                    .withString("title", book.getTitle())
                    .withString("author", book.getAuthor())
                    .withNumber("year", book.getYear());

            table.putItem(item);
            System.out.println("Book added: " + book);
        } catch (Exception e) {
            System.err.println("Failed to add book: " + e.getMessage());
        }
    }

    /** Retrieve all books */
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        try {
            ItemCollection<ScanOutcome> items = table.scan(new ScanSpec());
            for (Item item : items) {
                Book book = new Book(
                        item.getString("bookId"),
                        item.getString("title"),
                        item.getString("author"),
                        item.getInt("year")
                );
                books.add(book);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving books: " + e.getMessage());
        }
        return books;
    }

    /** Update book title & author (example) */
    public void updateBook(String bookId, String newTitle, String newAuthor, int newYear) {
        try {
            UpdateItemSpec updateItemSpec = new UpdateItemSpec()
                    .withPrimaryKey("bookId", bookId)
                    .withUpdateExpression("set title = :t, author = :a, year = :y")
                    .withValueMap(new ValueMap()
                            .withString(":t", newTitle)
                            .withString(":a", newAuthor)
                            .withNumber(":y", newYear))
                    .withReturnValues(ReturnValue.UPDATED_NEW);

            table.updateItem(updateItemSpec);
            System.out.println("Book updated: " + bookId);
        } catch (Exception e) {
            System.err.println("Failed to update book: " + e.getMessage());
        }
    }

    /** Delete book */
    public void deleteBook(String bookId) {
        try {
            table.deleteItem("bookId", bookId);
            System.out.println("Book deleted: " + bookId);
        } catch (Exception e) {
            System.err.println("Failed to delete book: " + e.getMessage());
        }
    }
}

