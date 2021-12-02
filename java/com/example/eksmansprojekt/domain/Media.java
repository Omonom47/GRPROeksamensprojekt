package com.example.eksmansprojekt.domain;

import javafx.scene.image.Image;

/*

 */
public abstract class Media {
    protected String title;
    protected String release;
    protected String[] genres;
    protected float rating;
    protected Image poster;

    public Media(String title, String release, String[] genres, float rating, Image poster){
        this.title = title;
        this.release = release;
        this.genres = genres;
        this.rating = rating;
        this.poster = poster;
    }

    public abstract String getDescription();

    public String getTitle(){
        return title;
    }

    public String getRelease(){
        return release;
    }

    public float getRating() {
        return rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public Image getPoster() { return poster; }


}
