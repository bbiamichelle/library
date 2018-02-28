package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testCreateBook(){
        Book book1 = new Book("1","TDD", "Kent", 2005);
        assertEquals("TDD", book1.getName());
        assertEquals("Kent", book1.getAuthor());
        assertEquals(2005, book1.getYears());
    }
}
