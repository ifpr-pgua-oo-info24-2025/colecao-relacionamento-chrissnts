package com.santos.christian.models;

public class PrintedBook extends Book {

    private int numberOfPages;

    public PrintedBook(String title, int yearOfPublication, Author author, int numberOfPages) {
        super(title, yearOfPublication, author);
        this.numberOfPages = numberOfPages;
    }

    public PrintedBook(String title, int yearOfPublication, int numberOfPages) {
        super(title, yearOfPublication);
        this.numberOfPages = numberOfPages;
    }

    public int getnumberOfPages() {
        return numberOfPages;
    }

    public void setnumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void showDetails() {
        System.out.println("Printed Book:");
        super.showDetails();
        System.out.println("Number of Pages: " + this.getnumberOfPages());
        System.out.println("\n");

    }

}
