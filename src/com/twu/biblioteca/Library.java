package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();
    List<Book> borrowedBooks = new ArrayList<>();


   public String showBookList(List<Book> bookList) {
       String representation = "";
       for (Book book : bookList) {
            if (representation.isEmpty()) {
                representation += getRepresentation(book);
            } else {
                representation += "\n" + getRepresentation(book);
            }
        }
        return representation;
    }

    private static String getRepresentation(Book book) {
        return String.format("%20s %20s %20s %20d", book.getId(), book.getName(), book.getAuthor(), book.getYears());
    }

    public void borrowBook(String id){
        for (Book book : this.bookList) {
            if (id.equals(book.getId())){
                borrowedBooks.add(book);
                int index = bookList.indexOf(book);
                bookList.remove(index);
                System.out.println("Thank you! Enjoy the book");
                return;
            }
        }
        System.out.println("This book is not available");
    }

    public void returnBooks(String id) {
        for (Book book : this.borrowedBooks) {
            if (id.equals(book.getId())) {
                bookList.add(book);
                int index = borrowedBooks.indexOf(book);
                borrowedBooks.remove(index);
                System.out.println("Thank you for returning the book.");
                return;

            }
        }
        System.out.println("This is not a valid book to return");
    }

    public String showBookTable(List<Book> bookList) {
        String representation = String.format("%20s %20s %20s %20s\n","ID", "Name", "Authors", "Years");
        return representation + showBookList(bookList);
    }

    public String showBookList(){
        return showBookTable(bookList);
    }

    public String showBorrowBook(){
        return showBookTable(bookList);
    }

    public String showUnavailableBook(){
        return showBookTable(borrowedBooks);
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public void createBookList() {
        bookList.add(new Book("1","TDD", "Kent", 2005));
        bookList.add(new Book("2","Design Patterns", "Fowler", 2004));
    }
}

