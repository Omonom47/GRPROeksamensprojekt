package com.example.eksmansprojekt.domain;

public class NoSuchMediaException extends Exception {
    public NoSuchMediaException(String notFound){
        super("The media with title " + notFound + " does not exist");
    }
}
