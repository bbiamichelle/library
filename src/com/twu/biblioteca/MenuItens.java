package com.twu.biblioteca;

import java.util.Scanner;

public class MenuItens  {

    Library library;

    public MenuItens(Library library) {
        this.library = library;
    }

    public void showWelcome(){
        System.out.println("\tWELCOME");
    }

    public void printMenuItens() {
        System.out.println("\t**Menu**");
        System.out.println("Select: (1) to browse books, (2) Lend, (3) Return (4) View available books (5) Show books unavailable (0) to exit. ");
        System.out.println("Option:");
    }

    public void showOption(int input){
        if (input >= 0) {
            int option;
            option = input;

            switch (option) {
                case 1:
                    System.out.println(library.showBookList());
                    break;

                case 2:
                    System.out.println("Print the ID number of the book you want to borrow");
                    Scanner scanner = new Scanner(System.in);
                    int inputUser = scanner.nextInt();
                    String inputString= String.valueOf(inputUser);
                    library.borrowBook(inputString);
                    break;

                case 3:
                    System.out.println("Print the ID number of the book you want to return");
                    Scanner scanner1 = new Scanner(System.in);
                    int inputReturn = scanner1.nextInt();
                    String inputReturnString = String.valueOf(inputReturn);
                    library.returnBooks(inputReturnString);
                    break;

                case 4:
                    System.out.println(library.showBorrowBook());
                    break;

                case 5:
                    System.out.println(library.showUnavailableBook());
                    break;

                case 0:
                    System.out.println("See you  later!");
                    break;

                default:
                    System.out.println("Select a valid option!");
            }
        }
    }

}







