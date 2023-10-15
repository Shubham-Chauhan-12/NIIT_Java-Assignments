package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){

       // Write the logic to read from a file

        FileInputStream fileInputStream = null;
        String readPoem ="";
        try {
            fileInputStream = new FileInputStream(fileName);
            int readData = 0;
            while((readData=fileInputStream.read())!=-1){
                //readData = ;
                char convertedData = (char)readData;
                readPoem = readPoem + convertedData;
            }
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
        return readPoem;
    }

    public static void main(String[] args) {

        Ballad ballad = new Ballad();
        String Poem = ballad.readPoemFromAFile("src/main/resources/ballad.txt");
        System.out.println(Poem);

    }


}
