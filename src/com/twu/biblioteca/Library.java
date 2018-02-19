package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Midias> bookList = new ArrayList<>();
    List<Midias> filmList = new ArrayList<>();

    public void createBookList() {
        bookList.add(new Book("B1", "TDD", "Kent", 2005));
        bookList.add(new Book("B2", "Design Patterns", "Fowler", 2004));
    }

    public void createFilmList() {
        filmList.add(new Film("F1", "A luz", "Bia", 2015));
        filmList.add(new Film("F2", "Mochila Azul", "Gatinho", 2014));
    }


}

//    boolean logado = false;
//    String[] usuarios = {"Bia","Gatinho","Gabi"};
//    String[] senhas = {"11111111","22222222","33333333"};
//    public boolean login(String username, String password){
//        for(int i = 0; i < usuarios.length; i++){
//            if(username.equals(usuarios[i]) && password.equals(senhas[i])){
//                logado = true;
//            }
//        }
//        return logado;
//    }