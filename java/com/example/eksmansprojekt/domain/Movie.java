package com.example.eksmansprojekt.domain;

import javafx.scene.image.Image;

public class Movie extends Media{

    public Movie(String title, String release, String[] genres, float rating, Image poster){
        super(title,release,genres,rating, poster);
    }
    @Override
    public String getDescription() {
        return "Movie: " + title+", released:" + release +", Has rating of "+ rating+"\n"+ genres.toString();
    }

}
