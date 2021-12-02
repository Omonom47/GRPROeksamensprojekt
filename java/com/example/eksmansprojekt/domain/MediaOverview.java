package com.example.eksmansprojekt.domain;
import com.example.eksmansprojekt.data.DataFileReader;
import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MediaOverview {
    List<Media> allMedia;

    public List<Media> getAllMedia() {
        return allMedia;
    }

    /**
     * A method for creating all media objects with the data given
     * in the files "film.txt" and "serier.txt"
     */
    public void initializeOverview() {
        allMedia = new ArrayList<>(200);
        DataFileReader d = DataFileReader.getInstance();
        d.readTxtFile("/materials/film.txt").forEach(line -> {
            String[] params = line.split(";");
            Image i = d.findPoster("/materials/filmplakater/"+params[0]+".jpg");
            allMedia.add(
                    new Movie(params[0], params[1], params[2].split(","), Float.parseFloat(params[3]),i)
            );
        });
        DataFileReader.getInstance().readTxtFile("/materials/serier.txt").forEach(line -> {
            String[] params = line.split(";");
            Image i = d.findPoster("/materials/serieforsider/"+params[0]+".jpg");
            allMedia.add(
                    new Series(params[0], params[1], params[2].split(","), Float.parseFloat(params[3]), params[4],i)
            );
        });

    }

    public void testShowAll() {
        allMedia.forEach(media -> {
            System.out.println(media.getDescription());
        });
    }


    public Media findMediaWithTitle(String title) throws NoSuchMediaException{
        for (Media e: allMedia) {
            if (e.getTitle().equals(title)){
                return e;
            }
        }
        throw new NoSuchMediaException(title);
    }

}
