package com.twu.biblioteca;

import java.util.List;

public class Library {
    List<Book> bookList;

    public Library (List<Book> bookList){
        this.bookList = bookList;
    }

    public String printWelcome() {
        return "Welcome"; }

   public String printBookList() {
       String representation = "";
       for (Book book : this.bookList) {
            if (representation.isEmpty()) {
                representation += getRepresentation(book);
            } else {
                representation += "\n" + getRepresentation(book);
            }
        }
        return representation;
    }

    private static String getRepresentation(Book book) {
        return String.format("%20s %20s %20d", book.getName(), book.getAuthor(), book.getYears());
    }

    public String printTable() {
        String representation = String.format("%20s %20s %20s\n", "Name", "Authors", "Years");
        return representation + printBookList();
    }
}

