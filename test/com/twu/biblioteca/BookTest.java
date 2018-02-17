package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testCreateBook(){
        Book book1 = new Book("1","TDD", "Kent", 2005);
        assertEquals("TDD", book1.name);
        assertEquals("Kent", book1.author);
        assertEquals(2005, book1.years);
    }
}
