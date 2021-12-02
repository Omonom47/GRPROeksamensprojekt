package com.example.eksmansprojekt.data;
import java.io.*;

public class DataFileWriter {
    private final DataFileWriter insance = new DataFileWriter();

    public void writeFile(String filename, String s){
        try {
            FileWriter fwrite = new FileWriter(filename, true);
            BufferedWriter rwrite = new BufferedWriter(fwrite);
            rwrite.write(s);
            rwrite.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
