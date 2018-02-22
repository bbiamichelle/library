package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class User extends Library {
    String name;
    String email;
    int phone;
    String password;

    public User(String name, String email, int phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public int getPhone() { return phone; }

    public String getPassword() { return password; }









}
