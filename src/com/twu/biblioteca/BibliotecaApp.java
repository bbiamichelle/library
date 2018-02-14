package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("TDD","Kent", 2005));
        bookList.add(new Book("Design Patterns","Fowler", 2004));
        Library library = new Library();
        library.setBookList(bookList);
        System.out.println(library.printWelcome());
        System.out.println(library.printTable());
    }
}