package com.example;



import com.example.db.DatabaseConnection;
import com.example.model.Book;
import com.example.service.BookService;





import com.amazonaws.services.dynamodbv2.document.DynamoDB;

import com.example.db.TableSetup;



import java.util.List;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        String tableName = "Books";

        // Ensure table exists + insert sample data if new
        DynamoDB dynamoDB = DatabaseConnection.getInstance();
        TableSetup.createBooksTable(dynamoDB);

        BookService bookService = new BookService(tableName);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Management Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(id, title, author, year);
                    bookService.addBook(book);
                    break;

                case 2:
                    List<Book> books = bookService.getAllBooks();
                    if (books.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        System.out.println("\n--- All Books ---");
                        books.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter New Year: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine();

                    bookService.updateBook(updateId, newTitle, newAuthor, newYear);
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    bookService.deleteBook(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting Library Management. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
