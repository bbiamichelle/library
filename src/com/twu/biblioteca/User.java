package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;
    String email;
    String phone;
    int password;

    List<User> userList = new ArrayList<>();

    public User(String name, String email, String phone, int password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<User> getUserList() {
        return userList;
    }
}
