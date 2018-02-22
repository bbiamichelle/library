package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;
    String email;
    int phone;
    int password;

    public User(String name, String email, int phone, int password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }
}
