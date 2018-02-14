package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {


    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testWelcome(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        assertEquals("Welcome", library.printWelcome());
    }

    @Test
    public void testCreateListBooks(){
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("TDD","Kent", 2005);
        Book book2 = new Book("JAVA", "Kent", 2015);
        bookList.add(book1);
        bookList.add(book2);
        assertTrue(bookList.contains(book1));
    }

    @Test
    public void testPrintBookList(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("TDD","Kent", 2005));
        library.setBookList(bookList);
        assertEquals(String.format("%20s %20s %20s","TDD", "Kent", "2005" ),library.printBookList());
    }

    @Test
    public void testPrintManyBooks(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("TDD","Kent", 2005));
        bookList.add(new Book("Design Patterns","Fowler", 2004));
        library.setBookList(bookList);
        assertEquals(String.format("%20s %20s %20s\n%20s %20s %20s",
                "TDD", "Kent", "2005", "Design Patterns", "Fowler", "2004"), library.printBookList());
    }

    @Test
    public void testPrintTable() {
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("TDD","Kent", 2005));
        bookList.add(new Book("Design Patterns","Fowler", 2004));
        library.setBookList(bookList);
        assertEquals(String.format("%20s %20s %20s\n%20s %20s %20s\n%20s %20s %20s",
                "Name","Authors", "Years", "TDD", "Kent", "2005", "Design Patterns", "Fowler", "2004"), library.printTable());
    }
}
