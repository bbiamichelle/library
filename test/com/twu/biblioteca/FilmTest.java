package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

        @Test
        public void testCreateBook(){
            Film film1 = new Film("1","A lua me traiu", "Bia", 2015);
            assertEquals("A lua me traiu", film1.name);
            assertEquals("Bia", film1.director);
            assertEquals(2015, film1.years);
        }
    }
