package com.example.eksmansprojekt.domain;

public class User {
    PersonalList personalList;
    private String username;
    private String password;

    public User(String username, String password){
        personalList = new PersonalList();
        this.username = username;
        this.password = password;
    }

    public PersonalList getPersonalList() {
        return personalList;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
