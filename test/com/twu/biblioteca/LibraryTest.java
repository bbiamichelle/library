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

        assertEquals(String.format("%20s %20s %20s %20d %20s\n%20s %20s %20s %20d %20s", "1",
                "TDD", "Kent", 2005, "Free", "2", "Design Patterns", "Fowler", 2004, "Free"), library.getMediasAsString(bookList));
    }

    @Test
    public void testGivenBookListShowMediaTable(){
        List<Book> bookList = new ArrayList<>();
        Library library = new Library();

        bookList.add(new Book("1","TDD","Kent", 2005));
        library.setBookList(bookList);
        assertEquals(String.format("%20s %20s %20s %20s %20s\n%20s %20s %20s %20d %20s",
                "ID", "Name","Authors", "Years","Status", "1", "TDD", "Kent", 2005, "Free"), library.showMediaInTable(bookList));
    }

    @Test
    public void testGivenFilmListShowMediaTable(){
        Library library = new Library();
        List<Film> filmList = new ArrayList<>();

        filmList.add(new Film("1", "A lua me traiu", "Bia", 2015));
        library.setFilmList(filmList);
        assertEquals(String.format("%20s %20s %20s %20s %20s\n%20s %20s %20s %20d %20s",
                "ID", "Name","Authors", "Years", "Status", "1", "A lua me traiu", "Bia", 2015, "Free"), library.showMediaInTable(filmList));
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
    }

    @Test
    public void testUnsuccessfulBorrowBook(){
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("1", "TDD", "Kent", 2005);

        bookList.add(book);
        library.setBookList(bookList);
        library.borrowLibraryBook("1");

        assertEquals("This book is not available", library.borrowLibraryBook("2"));
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

        assertEquals("This is not a valid book to return", library.returnBookToTheLibrary("2"));
        assertTrue(library.bookList.contains(book));
    }

    @Test
    public void testSucessfulBorrowFilm(){
        Library library = new Library();
        List<Film> filmList = new ArrayList<>();
        Film film = new Film("1", "TDD", "Kent", 2005);

        filmList.add(film);
        library.setFilmList(filmList);
        String borrowMessage = library.borrowLibraryFilm("1");

        assertEquals("Thank you! Enjoy the film", borrowMessage);
    }

    @Test
    public void testUnsuccessfulBorrowFilm(){
        Library library = new Library();
        List<Film> filmList = new ArrayList<>();
        Film film = new Film("1", "TDD", "Kent", 2005);

        filmList.add(film);
        library.setFilmList(filmList);
        library.borrowLibraryFilm("1");

        assertEquals("This film is not available", library.borrowLibraryFilm("2"));
    }

    @Test
    public void testSuccessfulReturnFilm(){
        Library library = new Library();
        List<Film> filmList = new ArrayList<>();
        Film film = new Film("1", "TDD", "Kent", 2005);

        filmList.add(film);
        library.setFilmList(filmList);
        library.borrowLibraryFilm("1");

        assertEquals("Thank you for returning the film", library.returnFilmToTheLibrary("1"));
    }

    @Test
    public void testUnsuccessfulReturnFilm(){
        Library library = new Library();
        List<Film> filmList = new ArrayList<>();
        Film film = new Film("1", "TDD", "Kent", 2005);

        filmList.add(film);
        library.setFilmList(filmList);
        library.borrowLibraryFilm("1");
        library.returnFilmToTheLibrary("1");

        assertEquals("This is not a valid film to return", library.returnFilmToTheLibrary("2"));
    }
}
