package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    @Test
    public void testCreateBookList(){
        Library library = new Library();
        library.createBookList();
        assertEquals(2, library.bookList.size());

    }

    @Test
    public void testCreateListBooks() {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("1","TDD", "Kent", 2005);
        Book book2 = new Book("2","JAVA", "Kent", 2015);
        bookList.add(book1);
        bookList.add(book2);
        assertTrue(bookList.contains(book1));
    }


    @Test
    public void testShowBookList(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("1","TDD","Kent", 2005));
        library.setBookList(bookList);

        assertEquals(String.format("%20s %20s %20s %20s","1", "TDD", "Kent", "2005" ),library.showBookList(bookList));
    }

    @Test
    public void testShowManyBooks(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("1","TDD","Kent", 2005));
        bookList.add(new Book("2","Design Patterns","Fowler", 2004));
        library.setBookList(bookList);

        assertEquals(String.format("%20s %20s %20s %20d\n%20s %20s %20s %20d", "1",
                "TDD", "Kent", 2005, "2", "Design Patterns", "Fowler", 2004), library.showBookList(bookList));
    }

    @Test
    public void testShowBookTable() {
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("1","TDD","Kent", 2005));
        bookList.add(new Book("2","Design Patterns","Fowler", 2004));
        library.setBookList(bookList);
        assertEquals(String.format("%20s %20s %20s %20s\n%20s %20s %20s %20d\n%20s %20s %20s %20d",
                "ID", "Name","Authors", "Years", "1", "TDD", "Kent", 2005, "2", "Design Patterns", "Fowler", 2004), library.showBookTable(bookList));
    }

    @Test
    public void testBorrowBookforUser(){
        List<Book> bookList = new ArrayList<>();
        List<Book> borrowedBooks = new ArrayList<>();
        Book book1 = new Book("1","TDD", "Kent", 2005);
        borrowedBooks.add(book1);
        bookList.remove(book1);
        assertTrue(borrowedBooks.contains(book1));
        }

    @Test
    public void testBorrowBook(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("1","TDD", "Kent", 2005);
        bookList.remove(book1);
        library.borrowBook("1");
        assertTrue(library.borrowedBooks.add(book1));
    }

    @Test
    public void testRemoveBookBorrowOfBookList(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("1","TDD", "Kent", 2005);
        bookList.remove(book1);
        library.borrowBook("1");
        assertFalse(library.bookList.contains(book1));
    }

    @Test
    public void testReturnBookAndAddBookList(){
        Library library = new Library();
        List<Book> borrowedBook = new ArrayList<>();
        Book book1 = new Book("1","TDD", "Kent", 2005);
        borrowedBook.remove(book1);
        library.borrowBook("1");
        assertTrue(library.bookList.add(book1));
    }

    @Test
    public void testReturnBookAndRemoveBookOfBorrowedBook(){
        Library library = new Library();
        List<Book> borrowedBook = new ArrayList<>();
        Book book1 = new Book("1","TDD", "Kent", 2005);
        borrowedBook.remove(book1);
        library.borrowBook("1");
        assertFalse(library.borrowedBooks.contains(book1));
    }


}
