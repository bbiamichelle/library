package com.twu.biblioteca;

public class MenuItens  {

    Library library;

    public MenuItens(Library library) {
        this.library = library;
    }

    public void printMenuItens() {
        System.out.println("\t**Menu**");
        System.out.println("Selecione: (1) para Consultar livros e (0) para Sair. ");
        System.out.println("Opcao:");
    }

    public void showOption(){
        int input = 1;
        if (input != 0) {
            int option;
            option = input;

            switch (option) {
                case 1:
                    consulta();
                    break;

                case 2:
                    sair();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public void consulta() {
        System.out.println(library.printBookList());
    }

    public static void sair() {
    }
}







