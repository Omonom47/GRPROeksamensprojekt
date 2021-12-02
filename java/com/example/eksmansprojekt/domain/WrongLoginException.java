package com.example.eksmansprojekt.domain;

public class WrongLoginException extends Exception {
    public WrongLoginException(){
        super("Username or password is incorrect");
    }
}
