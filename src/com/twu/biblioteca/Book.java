package com.twu.biblioteca;

public class Book {

    String id;
    String name;
    String author;
    int years;


    Book (String id, String name, String author, int years){
        this.name = name;
        this.author = author;
        this.years = years;
        this.id = id;
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

    public String getId() {
        return id;
    }
}
