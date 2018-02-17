package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = new Library();
        library.createBookList();

        MenuItens menuItens = new MenuItens(library);
        menuItens.showWelcome();
        menuItens.printMenuItens();

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (input > 0){
            menuItens.showOption(input);
            menuItens.printMenuItens();
            input = scanner.nextInt();
        }

    }
}