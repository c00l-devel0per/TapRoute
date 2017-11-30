package com.example.surajnath.taproute.Model;

/**
 * Created by Suraj Nath on 11/24/2017.
 */

public class User {
    private String Email , Passowrd , Name , Phone;

    public User() {
    }

    public User(String email, String passowrd, String name, String phone) {
        Email = email;
        Passowrd = passowrd;
        Name = name;
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassowrd() {
        return Passowrd;
    }

    public void setPassowrd(String passowrd) {
        Passowrd = passowrd;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
