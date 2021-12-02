package com.example.eksmansprojekt.domain;

import javafx.scene.image.Image;

public class Series extends Media {

    private Season[] seasons;

    public Series(String title, String release, String[] genres, float rating, String seasonInfo, Image poster){
        super(title, release, genres, rating, poster);
        fillSeasons(seasonInfo);
    }

    private void fillSeasons(String info){
        String[] sInfo = info.split(",");
        seasons = new Season[sInfo.length];
        for (int i = 0; i < sInfo.length; i++) {
            seasons[i] = new Season(Integer.parseInt(sInfo[i].split("-")[1]));
        }
    }

    @Override
    public String getDescription() {
        return "Series: " + title+", released:" + release +", Has rating of "+ rating+"\n"+ genres.toString();
    }

}
