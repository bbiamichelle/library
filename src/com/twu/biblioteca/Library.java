package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();
    List<Book> borrowedBooks = new ArrayList<>();
    List<Film> filmList = new ArrayList<>();
    List<Film> borrowedFilms = new ArrayList<>();

    public void createBookList() {
        bookList.add(new Book("1", "TDD", "Kent", 2005));
        bookList.add(new Book("2", "Design Patterns", "Fowler", 2004));
    }

    public void createFilmList() {
        filmList.add(new Film("1", "A luz", "Bia", 2015));
        filmList.add(new Film("2", "Mochila Azul", "Gatinho", 2014));
    }

    public String showFilmList(List<Film> filmList) {
        String representation = "";
        for (Film film : filmList) {
            if (representation.isEmpty()) {
                representation += film.toString();
            } else {
                representation += "\n" + film.toString();
            }
        }
        return representation;
    }

    public String showBookList(List<Book> bookList) {
        String representation = "";
        for (Book book : bookList) {
            if (representation.isEmpty()) {
                representation += book.toString();
            } else {
                representation += "\n" + book.toString();
            }
        }
        return representation;
    }

    public String showFilmTable(List<Film> filmList) {
        String representation = String.format("%20s %20s %20s %20s\n","ID", "Name", "Authors", "Years");
        return representation + showFilmList(filmList);
    }

    public String showBookTable(List<Book> bookList) {
        String representation = String.format("%20s %20s %20s %20s\n", "ID", "Name", "Authors", "Years");
        return representation + showBookList(bookList);
    }

    public void borrowFilm(String id){
        for (Film film : this.filmList) {
            if (id.equals(film.getId())){
                borrowedFilms.add(film);
                int index = filmList.indexOf(film);
                filmList.remove(index);
                System.out.println("Thank you! Enjoy the book");
                return;
            }
        }
        System.out.println("This book is not available");
    }

    public void borrowBook(String id) {
        for (Book book : this.bookList) {
            if (id.equals(book.getId())) {
                borrowedBooks.add(book);
                int index = bookList.indexOf(book);
                bookList.remove(index);
                System.out.println("Thank you! Enjoy the book");
                return;
            }
        }
        System.out.println("This book is not available");
    }

    public void returnFilm(String id) {
        for (Film film : this.borrowedFilms) {
            if (id.equals(film.getId())) {
                filmList.add(film);
                int index = borrowedFilms.indexOf(film);
                borrowedFilms.remove(index);
                System.out.println("Thank you for returning the book.");
                return;

            }
        }
        System.out.println("This is not a valid book to return");
    }

    public void returnBook(String id){
        for (Midias book : this.borrowedBooks) {
            if (id.equals(book.getId())) {
                bookList.add((Book) book);
                int index = borrowedBooks.indexOf(book);
                borrowedBooks.remove(index);
                System.out.println("Thank you for returning the book.");
                return;

            }
        }
        System.out.println("This is not a valid book to return");
        return;
    }

    public String unavailableFilm (){
        return showFilmTable(borrowedFilms);
    }

    public String unavailableBook (){
        return showBookTable(borrowedBooks);
    }

    public String showBook(){
        return showBookTable(bookList);
    }

    public String showFilm(){
        return showFilmTable(filmList);
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}

//    boolean logado = false;
//    String[] usuarios = {"Bia","Gatinho","Gabi"};
//    String[] senhas = {"11111111","22222222","33333333"};
//    public boolean login(String username, String password){
//        for(int i = 0; i < usuarios.length; i++){
//            if(username.equals(usuarios[i]) && password.equals(senhas[i])){
//                logado = true;
//            }
//        }
//        return logado;
//    }