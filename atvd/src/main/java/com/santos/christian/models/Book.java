package com.santos.christian.models;

public class Book {

    private String title;
    private int yearOfPublication;
    private Author author;

    public Book(String title, int yearOfPublication, Author author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    
    public Book(String title, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void showDetails() {

        System.out.println("Title: " + this.getTitle());
        System.out.println("Year of Publication: " + this.getYearOfPublication());
        if (author != null) {
            author.showAuthorDetails();
        } else {
            System.out.println("Author: Unknown");
        }
    }
}
