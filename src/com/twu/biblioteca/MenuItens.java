package com.twu.biblioteca;

import java.util.Scanner;

public class MenuItens  {

    Midias midias;

    public MenuItens(Midias midias) {
        this.midias = midias;
    }

    public void showWelcome(){
        System.out.println("\tWELCOME");
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
                    System.out.println(midias.showTable(bookList)); // mostar livros disponiveis
                    break;

                case 2:
                    System.out.println("Print the ID number of the book you want to borrow");
                    Scanner scanner = new Scanner(System.in);
                    int inputUser = scanner.nextInt();
                    String inputString= String.valueOf(inputUser);
                    midias.borrowMidias(inputString);
                    break;

                case 3:
                    System.out.println("Print the ID number of the book you want to return");
                    Scanner scanner1 = new Scanner(System.in);
                    int inputReturn = scanner1.nextInt();
                    String inputReturnString = String.valueOf(inputReturn);
                    midias.returnMidias(inputReturnString);
                    break;

                case 4:
                    System.out.println(midias.unavailableMidias()); // livros emprestados
                    break;

                case 5:
                    System.out.println(midias.showTable()); // mostar filmes disponiveis
                    break;

                case 6:
                    System.out.println("Print the ID number of the book you want to borrow");
                    Scanner scanner2 = new Scanner(System.in);
                    int inputUser2 = scanner2.nextInt();
                    String inputString2= String.valueOf(inputUser2);
                    midias.borrowMidias(inputString2);
                    break;

                case 7:
                    System.out.println("Print the ID number of the book you want to return");
                    Scanner scanner3 = new Scanner(System.in);
                    int inputReturn3 = scanner3.nextInt();
                    String inputReturnString3 = String.valueOf(inputReturn3);
                    midias.returnMidias(inputReturnString3);
                    break;

                case 8:
                    System.out.println(midias.unavailableMidias()); // filmes emprestados
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




