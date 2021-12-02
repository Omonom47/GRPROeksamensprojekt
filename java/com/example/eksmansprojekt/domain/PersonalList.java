package com.example.eksmansprojekt.domain;

import java.util.ArrayList;
import java.util.List;


public class PersonalList {

    private List<Media> mediaList;

    public PersonalList(){
        mediaList = new ArrayList<>();
    }

    public void show(){
        if(mediaList.isEmpty()){
            System.out.println("Is empty");
        }
        else{
            for (Media m: mediaList) {
                System.out.println(m.getDescription());
            }
        }

    }

    public void add(String title){

    }

    public void add(Media e){
        mediaList.add(e);
    }

    public void remove(Media e){
        mediaList.remove(e);
    }
}
