package com.twu.biblioteca;

public class Book {

    String name;
    String author;
    int years;

    Book (String name, String author, int years){
        this.name = name;
        this.author = author;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYears() {
        return years;
    }
}
