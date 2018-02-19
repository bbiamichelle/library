package com.twu.biblioteca;

public class Film extends Midias {


    String id;
    String name;
    int years;
    String director;

    public Film(String id, String name, String director, int years){
        this.id = id;
        this.name = name;
        this.director = director;
        this.years = years;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public int getYears() { return years; }

    public String getAuthor() { return director; } //ve como fica a questao autor e diretor

    @Override
    public String toString() {
        return String.format("%20s %20s %20s %20d", id, name, director, years);
    }
}
