package com.java.oop.library;

public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed = false;

    public LibraryBook(String bookTitle, String bookAuthor){
        title = bookTitle;
        author = bookAuthor;
    }
    public void borrowBook(){
        if (isBorrowed){
            isBorrowed = true;
            System.out.println("You just borrowed this book!");
        }
        else {
            System.out.println("It's already borrowed");
        }
    }
    public void returnBook(){
        if (!isBorrowed){
            isBorrowed = false;
            System.out.println("Thank you for returning this book");
        }
        else {
            System.out.println("This book was not borrowed");
        }
    }
    public String status(){
        if (isBorrowed){
            return "Borrowed";
        }
        else{
            return "Available";
        }
    }
    @Override
    public String toString(){
        return "The book " + title + " with the author " + author + " is currently " + status();
    }
}
