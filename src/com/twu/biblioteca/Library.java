package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();

   public String showBookList() {
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

    public String showBookTable() {
        String representation = String.format("%20s %20s %20s\n", "Name", "Authors", "Years");
        return representation + showBookList();
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void createBookList() {
        bookList.add(new Book("TDD", "Kent", 2005));
        bookList.add(new Book("Design Patterns", "Fowler", 2004));
    }
}

