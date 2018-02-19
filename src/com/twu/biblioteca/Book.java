package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Book extends Midias {

    List<Book> bookList = new ArrayList<>();
    List<Book> borrowedBooks = new ArrayList<>();

    String id;
    String name;
    String author;
    int years;


    Book(String id, String name, String author, int years) {
        this.name = name;
        this.author = author;
        this.years = years;
        this.id = id;

    }

    public String showList(List<Midias> bookList) {
        String representation = "";
        for (Midias book : bookList) {
            if (representation.isEmpty()) {
                representation += getRepresentation(book);
            } else {
                representation += "\n" + getRepresentation(book);
            }
        }
        return representation;
    }

    public String getRepresentation(Midias book) {
        return String.format("%20s %20s %20s %20d", book.getId(), book.getName(), book.getAuthor(), book.getYears());
    }

    public String showTable(List<Midias> bookList) {
        String representation = String.format("%20s %20s %20s %20s\n", "ID", "Name", "Authors", "Years");
        return representation + showList(bookList);
    }

    public void borrowMidias(String id) {
        for (Midias book : this.bookList) {
            if (id.equals(book.getId())) {
                borrowedBooks.add((Book) book);
                int index = bookList.indexOf(book);
                bookList.remove(index);
                System.out.println("Thank you! Enjoy the book");
                return;
            }
        }
        System.out.println("This book is not available");
    }

    public void returnMidias (String id){
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

    public List unavailableMidias (){
        return borrowedBooks;
    }

    public String getName() { return name; }

    public String getAuthor() { return author; }

    public int getYears() { return years; }

    public String getId() { return id; }

}
