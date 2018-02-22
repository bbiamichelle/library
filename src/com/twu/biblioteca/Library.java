package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    User user;

    List<Book> bookList = new ArrayList<>();
    List<Book> borrowedBooks = new ArrayList<>();
    List<Film> filmList = new ArrayList<>();
    List<Film> borrowedFilms = new ArrayList<>();
    List<String> stringListName = new ArrayList<>();
    List<String> stringsListPassword = new ArrayList<>();
    List<User> userList = new ArrayList<>();

    protected void creatListUserAndPassword(){
        User user1 = new User("Bia","bia@gmail.com", 99990000, "12121212");
        User user2 = new User("Marcelo", "gatinho@gmail.com", 98989898, "21212121");

        userList.add(user1);
        userList.add(user2);

        stringListName.add(user1.getName());
        stringListName.add(user2.getName());

        stringsListPassword.add(user1.getPassword());
        stringsListPassword.add(user2.getPassword());
    }

    boolean logado = false;

    public boolean logado (){
        return this.logado;
    }

    public boolean login (String username, String password) {
        for (User user : userList) {
            if (username.equals(user.getName()) && password.equals(user.getPassword())) {
                logado = true;
                System.out.println("Welcome " + user.getName());
                System.out.println("Email: " + user.getEmail() + " Phone: " + user.getPhone());
            }
        }
        return logado;
    }

    private String tableHeader = String.format("%20s %20s %20s %20s\n","ID", "Name", "Authors", "Years");

    public void createBookList() {
        bookList.add(new Book("1", "TDD", "Kent", 2005));
        bookList.add(new Book("2", "Design Patterns", "Fowler", 2004));
    }

    public void createFilmList() {
        filmList.add(new Film("1", "A luz", "Bia", 2015));
        filmList.add(new Film("2", "Mochila Azul", "Gatinho", 2014));
    }

    public <T extends Media> String showMediaInTable(List<T> midiasList) {
        return tableHeader + getMediasAsString(midiasList);
    }

    public <T extends Media> String getMediasAsString(List<T> midiasList){
        String representation = "";
        for (Media media : midiasList){
            if (representation.isEmpty()){
                representation += media.toString();
            }else {
                representation += "\n" + media.toString(); }
        }return representation;
    }

    public String borrowLibraryFilm(String id){
        for (Film film : this.filmList) {
            if (id.equals(film.getId())){
                borrowedFilms.add(film);
                int index = filmList.indexOf(film);
                filmList.remove(index);
                return "Thank you! Enjoy the film";
            }
        }return "This film is not available";
    }

    public String borrowLibraryBook(String id) {
        for (Book book : this.bookList) {
            if (id.equals(book.getId())) {
                borrowedBooks.add(book);
                int index = bookList.indexOf(book);
                bookList.remove(index);
                return "Thank you! Enjoy the book";
            }
        }return "This book is not available";
    }

    public String returnFilmToTheLibrary(String id) {
        for (Film film : this.borrowedFilms) {
            if (id.equals(film.getId())) {
                filmList.add(film);
                int index = borrowedFilms.indexOf(film);
                borrowedFilms.remove(index);
                return "Thank you for returning the film";
            }
        }return "This is not a valid film to return";
    }

    public String returnBookToTheLibrary(String id){
        for (Media book : this.borrowedBooks) {
            if (id.equals(book.getId())) {
                bookList.add((Book) book);
                int index = borrowedBooks.indexOf(book);
                borrowedBooks.remove(index);
                return "Thank you for returning the book";
            }
        }return "This is not a valid book to return";
    }

    public String unavailableFilm (){ return showMediaInTable(borrowedFilms); }

    public String unavailableBook (){ return showMediaInTable(borrowedBooks); }

    public void setBookList(List<Book> bookList) { this.bookList = bookList; }

    public void setFilmList(List<Film> filmList) { this.filmList = filmList; }
}

