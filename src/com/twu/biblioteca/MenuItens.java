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

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Login:");
        String nome = scanner.nextLine();

        System.out.print("Password:");
        String password = scanner.nextLine();

        library.login(nome, password);
    }

    public void printMenuItens() {
        System.out.println("\t**Menu**");
        System.out.println("Select: (1) to browse books, (2) Lend Book, (3) Return Book " +
                "\n (4) Show books unavailable (5) to browse films (6) Lend film" +
                "\n (7) Return Film (8) Show films unavailable(0) to exit. ");
        System.out.println("Option:");
    }

    public void showOption(int input){
        if (input >= 0) {
            int option;
            option = input;

            switch (option) {
                case 1:
                    System.out.println(library.showMediaInTable(library.bookList));
                    break;

                case 2:
                    System.out.println("Print the ID number of the book you want to borrow");
                    Scanner scannerInputBook = new Scanner(System.in);
                    int inputBook = scannerInputBook.nextInt();
                    String inputStringBook= String.valueOf(inputBook);
                    System.out.println(library.borrowLibraryBook(inputStringBook));
                    break;

                case 3:
                    System.out.println("Print the ID number of the book you want to return");
                    Scanner scannerReturnBook = new Scanner(System.in);
                    int inputReturnBook = scannerReturnBook.nextInt();
                    String inputReturnStringBook = String.valueOf(inputReturnBook);
                    library.returnBookToTheLibrary(inputReturnStringBook);
                    break;

                case 4:
                    System.out.println(library.unavailableBook());
                    break;

                case 5:
                    System.out.println(library.showMediaInTable(library.filmList));
                    break;

                case 6:
                    System.out.println("Print the ID number of the film you want to borrow");
                    Scanner scannerInputFilm = new Scanner(System.in);
                    int inputFilm = scannerInputFilm.nextInt();
                    String inputStringFilm= String.valueOf(inputFilm);
                    library.borrowLibraryFilm(inputStringFilm);
                    break;

                case 7:
                    System.out.println("Print the ID number of the film you want to return");
                    Scanner scannerReturnFilm = new Scanner(System.in);
                    int inputReturnFilm = scannerReturnFilm.nextInt();
                    String inputReturnStringFilm = String.valueOf(inputReturnFilm);
                    library.returnFilmToTheLibrary(inputReturnStringFilm);
                    break;

                case 8:
                    System.out.println(library.unavailableFilm());
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


//    public void login(){
//        System.out.println("\t Por favor,Insira seu Login (nome) e senha para continuar");
//        System.out.println("Login:");
//        System.out.println("Senha:");
//        Scanner nameUser = new Scanner(System.in);
//        Scanner senhaUser = new Scanner(System.in);
//        library.login(nameUser.nextLine(), senhaUser.nextLine());
//
//    }




