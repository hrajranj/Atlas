package com.example.model;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int year;

    public Book(String bookId, String title, String author, int year) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters & Setters
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return "Book [ID=" + bookId + ", Title=" + title +
                ", Author=" + author + ", Year=" + year + "]";
    }
}
