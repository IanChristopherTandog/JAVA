package com.java.oop.library;

public class Main {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("1984", "George Orwell");

        System.out.println(book);           // Book: 1984 by George Orwell (Available)
        book.borrowBook();
        System.out.println(book.status()); // Borrowed
        book.returnBook();
        System.out.println(book);           // Book: 1984 by George Orwell (Available)
    }
}
