package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Film extends Midias {

    List<Film> filmList = new ArrayList<>();
    List<Film> borroewdFilms = new ArrayList<>();

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
    public String showList(List<Midias> filmList) {
        String representation = "";
        for (Midias film : filmList) {
            if (representation.isEmpty()) {
                representation += getRepresentation(film);
            } else {
                representation += "\n" + getRepresentation(film);
            }
        }
        return representation;
    }

    public String getRepresentation(Midias film) {
        return String.format("%20s %20s %20s %20d", film.getId(), film.getName(), film.getAuthor(), film.getYears());
    }

    public String showTable(List<Midias> filmList) {
        String representation = String.format("%20s %20s %20s %20s\n","ID", "Name", "Authors", "Years");
        return representation + showList(filmList);
    }

    public void borrowMidias(String id){
        for (Film film : this.filmList) {
            if (id.equals(film.getId())){
                borroewdFilms.add(film);
                int index = filmList.indexOf(film);
                filmList.remove(index);
                System.out.println("Thank you! Enjoy the book");
                return;
            }
        }
        System.out.println("This book is not available");
    }

    public void returnMidias(String id) {
        for (Film film : this.borroewdFilms) {
            if (id.equals(film.getId())) {
                filmList.add(film);
                int index = borroewdFilms.indexOf(film);
                borroewdFilms.remove(index);
                System.out.println("Thank you for returning the book.");
                return;

            }
        }
        System.out.println("This is not a valid book to return");
    }

    public List unavailableMidias (){
        return borroewdFilms;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public int getYears() { return years; }

    public String getAuthor() { return director; } //ve como fica a questao autor e diretor

}
