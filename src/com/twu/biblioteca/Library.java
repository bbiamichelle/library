package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList = new ArrayList<>();
    List<Film> filmList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    private User user;

    public void createBookList() {
        bookList.add(new Book("1", "TDD", "Kent", 2005));
        bookList.add(new Book("2", "Design Patterns", "Fowler", 2004));
    }

    public void createFilmList() {
        filmList.add(new Film("1", "A luz", "Bia", 2015));
        filmList.add(new Film("2", "Mochila Azul", "Gatinho", 2014));
    }

    protected void createListUserAndPassword(){
        User user1 = new User("11112222","Bia","bia@gmail.com", 99990000, "12121212");
        User user2 = new User("22223333","Marcelo", "gatinho@gmail.com", 98989898, "21212121");

        userList.add(user1);
        userList.add(user2);
    }

    private boolean logged = false;

    public boolean isLogged(){
        return this.logged;
    }

    public boolean login (String idUser, String password) {
        for (User user : userList) {
            if (idUser.equals(user.getIdUser()) && password.equals(user.getPassword())) {
                logged = true;
                this.user = user;
                System.out.println("Welcome " + user.getName());
                System.out.println("Email: " + user.getEmail() + " Phone: " + user.getPhone());
            }
        }return logged;
    }

    private String tableHeader = String.format("%20s %20s %20s %20s %20s\n","ID", "Name", "Authors", "Years", "Status");

    public <T extends Media> String showMediaInTable(List<T> mediaList) {
        return tableHeader + getMediasAsString(mediaList);
    }

    public <T extends Media> String getMediasAsString(List<T> mediaList){
        String representation = "";
        for (Media media : mediaList){
            if (representation.isEmpty()){
                representation += media.toString();
            }else {
                representation += "\n" + media.toString(); }
        }return representation;
    }

    public String borrowLibraryFilm(String id){
        for (Film film : this.filmList) {
            if (id.equals(film.getId())){
                film.lendToUser(this.user);
                return "Thank you! Enjoy the film";
            }
        }return "This film is not available";
    }

    public String borrowLibraryBook(String id) {
        for (Book book : this.bookList) {
            if (id.equals(book.getId())) {
               book.lendToUser(this.user);
                return "Thank you! Enjoy the book";
            }
        }return "This book is not available";
    }

    public String returnFilmToTheLibrary(String id) {
        for (Film film : this.filmList) {
            if (id.equals(film.getId())) {
                film.setReturn();
                return "Thank you for returning the film";
            }
        }return "This is not a valid film to return";
    }

    public String returnBookToTheLibrary(String id){
        for (Media book : this.bookList) {
            if (id.equals(book.getId())) {
                book.setReturn();
                return "Thank you for returning the book";
            }
        }return "This is not a valid book to return";
    }

    public String showUnavailableFilm(){
        List<Film> borrowedFilms = new ArrayList<>();
        for (Film film : filmList){
            if (!film.getToBeAvailable()){
                borrowedFilms.add(film);
            }
        }
        return showMediaInTable(borrowedFilms);
    }

    public String showUnavailableBook(){
        List<Book> borrowedBooks = new ArrayList<>();
        for (Book book : bookList){
            if (!book.getToBeAvailable()){
                borrowedBooks.add(book);
            }
        }
        return showMediaInTable(borrowedBooks);
    }

    public void setBookList(List<Book> bookList) { this.bookList = bookList; }

    public void setFilmList(List<Film> filmList) { this.filmList = filmList; }


}

