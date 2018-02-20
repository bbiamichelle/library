package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class MenuItensTest {



//    @Test
//    public void testPrintMenuItensOptionPrintsCorrectly(){
//        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(stdout));
//
//        Library library = new Library();
//        MenuItens menu = new MenuItens(library);
//        menu.printMenuItens();
//        assertEquals("\t**Menu**\nSelecione: (1) para Consultar livros e (0) para Sair. \nOpcao:\n", stdout.toString());
//    }
//
//    @Test
//    public void testShowOptionInvokesPrintBookList(){
//        class MockedLibrary extends Library{
//            public boolean printBookListWasCalled = false;
//
//            public String getBooksAsString(){
//                printBookListWasCalled = true;
//                return "ok";
//            }
//        }
//        MockedLibrary library = new MockedLibrary();
//        MenuItens menu = new MenuItens(library);
//        menu.showOption();
//        assertTrue(library.printBookListWasCalled);
//    }
//
//    @Test
//    public void testShowOptionPrintsBookList(){
//        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(stdout));
//
//        class MockedLibrary extends Library{
//            public boolean printBookListWasCalled = false;
//
//            public String getBooksAsString(){
//                printBookListWasCalled = true;
//                return "ok";
//            }
//        }
//        MockedLibrary library = new MockedLibrary();
//        MenuItens menu = new MenuItens(library);
//        menu.showOption();
//        assertEquals("ok\n", stdout.toString());
//    }
}

