package com.example.eksmansprojekt.domain;



public class Season {
    Episode[] episodes;

    public Season(int episodeAmount){
        episodes = new Episode[episodeAmount];
        setEpisodes();
    }

    public Episode[] getEpisodes(){
        return episodes;
    }

    private void setEpisodes(){
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = new Episode(i+1);
        }
    }

}
