package com.twu.biblioteca;

public class MenuItens  {

    Library library;

    public MenuItens(Library library) {
        this.library = library;
    }

    public void printMenuItens() {
        System.out.println("\tWELCOME");
        System.out.println("\t**Menu**");
        System.out.println("Select: (1) to browse books and (0) to exit. ");
        System.out.println("Option:");
    }

    public void showOption(int input){
        if (input >= 0) {
            int option;
            option = input;

            switch (option) {
                case 1:
                    System.out.println(library.showBookTable());
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







