package com.example.eksmansprojekt.data;
import javafx.scene.image.Image;
import java.io.*;
import java.util.stream.Stream;

public class DataFileReader {
    
    private static final DataFileReader instance = new DataFileReader();

    public static DataFileReader getInstance() {
        return instance;
    }

    public Stream<String> readTxtFile(String fileName){

        InputStream ioStream = DataFileReader.class.getResourceAsStream(fileName);
        InputStreamReader isReader = new InputStreamReader(ioStream);
        BufferedReader bufferedReader = new BufferedReader(isReader);
        return bufferedReader.lines();
    }

    public Image findPoster(String title){
        Image image = new Image(DataFileReader.class.getResourceAsStream(title));
        return image;
    }

}
