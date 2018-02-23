package com.twu.biblioteca;

public class User extends Library {
    String idUser;
    String name;
    String email;
    int phone;
    String password;

    public User(String idUser, String name, String email, int phone, String password) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getIdUser() { return idUser; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public int getPhone() { return phone; }

    public String getPassword() { return password; }
}
