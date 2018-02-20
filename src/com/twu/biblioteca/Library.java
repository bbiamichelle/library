package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();
    List<Book> borrowedBooks = new ArrayList<>();
    List<Film> filmList = new ArrayList<>();
    List<Film> borrowedFilms = new ArrayList<>();

    private String tableHeader = String.format("%20s %20s %20s %20s\n","ID", "Name", "Authors", "Years");

    public void createBookList() {
        bookList.add(new Book("1", "TDD", "Kent", 2005));
        bookList.add(new Book("2", "Design Patterns", "Fowler", 2004));
    }

    public void createFilmList() {
        filmList.add(new Film("1", "A luz", "Bia", 2015));
        filmList.add(new Film("2", "Mochila Azul", "Gatinho", 2014));
    }

    public <T extends Midias> String showMediaTable(List<T> midiasList) {
        return tableHeader + getMediasAsString(midiasList);
    }

    public <T extends Midias> String getMediasAsString(List<T> midiasList){
        String representation = "";
        for (Midias media : midiasList){
            if (representation.isEmpty()){
                representation += media.toString();
            }else {
                representation += "\n" + media.toString();
            }
        }
        return representation;
    }

    public String borrowFilm(String id){
        for (Film film : this.filmList) {
            if (id.equals(film.getId())){
                borrowedFilms.add(film);
                int index = filmList.indexOf(film);
                filmList.remove(index);
                return "Thank you! Enjoy the film";
            }
        }
        return "This film is not available";
    }

    public String borrowBook(String id) {
        for (Book book : this.bookList) {
            if (id.equals(book.getId())) {
                borrowedBooks.add(book);
                int index = bookList.indexOf(book);
                bookList.remove(index);
                return "Thank you! Enjoy the book";
            }
        }
        return "This book is not available";
    }

    public String returnFilm(String id) {
        for (Film film : this.borrowedFilms) {
            if (id.equals(film.getId())) {
                filmList.add(film);
                int index = borrowedFilms.indexOf(film);
                borrowedFilms.remove(index);
                return "Thank you for returning the film";
            }
        }
        return "This is not a valid film to return";
    }

    public String returnBook(String id){
        for (Midias book : this.borrowedBooks) {
            if (id.equals(book.getId())) {
                bookList.add((Book) book);
                int index = borrowedBooks.indexOf(book);
                borrowedBooks.remove(index);
                return "Thank you for returning the book";
            }
        }
        return "This is not a valid book to return";
    }

    public String unavailableFilm (){ return showMediaTable(borrowedFilms); }

    public String unavailableBook (){ return showMediaTable(borrowedBooks); }

    public String showBook(){ return showMediaTable(bookList); }

    public String showFilm(){ return showMediaTable(filmList); }

    public void setBookList(List<Book> bookList) { this.bookList = bookList; }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
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