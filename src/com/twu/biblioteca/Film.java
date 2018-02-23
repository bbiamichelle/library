package com.twu.biblioteca;

public class Film extends Media {
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

    @Override
    public String toString() {
        String nome;
        if (this.possessor != null){
            nome = this.possessor.name;
        } else{
            nome = "Livre";
        }
       return String.format("%20s %20s %20s %20d %20s", id, name, director, years, nome);
    }
}
