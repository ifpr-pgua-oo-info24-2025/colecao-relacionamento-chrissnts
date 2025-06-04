package com.santos.christian.models;

public class DigitalBook extends Book {
    
    private Double fileSizeMb;

    public DigitalBook(String title, int yearOfPublication, Author author, Double fileSizeMb) {
        super(title, yearOfPublication, author);
        this.fileSizeMb = fileSizeMb;
    }

    public DigitalBook(String title, int yearOfPublication, Double fileSizeMb) {
        super(title, yearOfPublication);
        this.fileSizeMb = fileSizeMb;
    }

    public Double getFileSizeMb() {
        return fileSizeMb;
    }

    public void setFileSizeMb(Double fileSizeMb) {
        this.fileSizeMb = fileSizeMb;
    }

    @Override
    public void showDetails(){
        System.out.println("Digital Book:");
        super.showDetails();
        System.out.println("File Size (MB): " + this.getFileSizeMb() + "MB");
        System.out.println("\n");
    }
}
