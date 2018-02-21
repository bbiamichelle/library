package com.twu.biblioteca;

public class Book extends Media {
    String id;
    String name;
    String author;
    int years;

    Book(String id, String name, String author, int years) {
        this.name = name;
        this.author = author;
        this.years = years;
        this.id = id;
    }

    public String getId() { return id; }

    @Override
    public String toString() { return String.format("%20s %20s %20s %20d", id, name, author, years); }
}
