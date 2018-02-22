package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testCreateBookList(){
        Library library = new Library();
        library.createBookList();
        assertEquals(2, library.bookList.size());
    }

    @Test
    public void testCreateFilmList(){
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
    public void testCreateListFilm() {
        List<Film> filmList = new ArrayList<>();
        Film film1 = new Film("1", "A luz", "Bia", 2015);
        Film film2 = new Film("2", "Mochila Azul", "Gatinho", 2014);
        filmList.add(film1);
        filmList.add(film2);
        assertTrue(filmList.contains(film1));
    }

    @Test
    public void testShowManyBooks(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();
        bookList.add(new Book("1","TDD","Kent", 2005));
        bookList.add(new Book("2","Design Patterns","Fowler", 2004));
        library.setBookList(bookList);

        assertEquals(String.format("%20s %20s %20s %20d\n%20s %20s %20s %20d", "1",
                "TDD", "Kent", 2005, "2", "Design Patterns", "Fowler", 2004), library.getMediasAsString(bookList));
    }

    @Test
    public void testGivenBookListShowMediaTable(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();

        bookList.add(new Book("1","TDD","Kent", 2005));
        library.setBookList(bookList);
        assertEquals(String.format("%20s %20s %20s %20s\n%20s %20s %20s %20d",
                "ID", "Name","Authors", "Years", "1", "TDD", "Kent", 2005), library.showMediaInTable(bookList));
    }

    @Test
    public void testGivenFilmListShowMediaTable(){
        Library library = new Library();
        List<Film> filmList = new ArrayList<>();

        filmList.add(new Film("1", "A lua me traiu", "Bia", 2015));
        library.setFilmList(filmList);
        assertEquals(String.format("%20s %20s %20s %20s\n%20s %20s %20s %20d",
                "ID", "Name","Authors", "Years", "1", "A lua me traiu", "Bia", 2015), library.showMediaInTable(filmList));
    }

    @Test
    public void testSucessfulBorrowBook(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("1", "TDD", "Kent", 2005);

        bookList.add(book);
        library.setBookList(bookList);
        String borrowMessage = library.borrowLibraryBook("1");

        assertEquals("Thank you! Enjoy the book", borrowMessage);
        assertFalse(library.bookList.contains(book));
    }

    @Test
    public void testUnsuccessfulBorrowBook(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("1", "TDD", "Kent", 2005);

        bookList.add(book);
        library.setBookList(bookList);
        library.borrowLibraryBook("1");

        assertEquals("This book is not available", library.borrowLibraryBook("1"));
        assertTrue(library.borrowedBooks.contains(book));
    }

    @Test
    public void testSuccessfulReturnBook(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("1", "TDD", "Kent", 2005);

        bookList.add(book);
        library.setBookList(bookList);
        library.borrowLibraryBook("1");

        assertEquals("Thank you for returning the book", library.returnBookToTheLibrary("1"));
        assertFalse(library.borrowedBooks.contains(book));
    }

    @Test
    public void testUnsuccessfulReturnBook(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("1", "TDD", "Kent", 2005);

        bookList.add(book);
        library.setBookList(bookList);
        library.borrowLibraryBook("1");
        library.returnBookToTheLibrary("1");

        assertEquals("This is not a valid book to return", library.returnBookToTheLibrary("1"));
        assertTrue(library.bookList.contains(book));
    }

//    @Test
//    public void testLoginForUser(){
//        Library library = new Library();
//        String user1 = "Bia";
//
//        assertTrue(library.getUserList().contains(user1));
//    }
//
//    @Test
//    public void testLoginForUseWithNameAndPassword(){
//        Library library = new Library();
//        String user1 = "Bia";
//        String pass= "12121212";
//
//        assertTrue(library.getUserList().contains(user1));
//        assertTrue(library.getPasswordList().contains(pass));
//
//    }
}
