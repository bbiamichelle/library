package com.twu.biblioteca;

public class Film extends Media {
    String director;

    public Film(String id, String name, String director, int years){
        super(id, name, years);
        this.director = director;
    }

    @Override
    public String toString() {
        String possessorName;
        if (this.possessor != null){
            possessorName = this.possessor.getName();
        } else{
            possessorName = "Free";
        }
       return String.format("%20s %20s %20s %20d %20s", this.getId(), this.getName(), director, this.getYears(), possessorName);
    }
}
