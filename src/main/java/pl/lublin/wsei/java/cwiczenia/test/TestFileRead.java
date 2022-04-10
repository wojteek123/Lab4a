

package pl.lublin.wsei.java.cwiczenia.test;

import javax.crypto.spec.PSource;
import java.io.*;
import java.nio.channels.Pipe;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TestFileRead {
    public static void main(String[] args) {
        try{
            String contents = new String(Files.readAllBytes(Paths.get("src/gusInfoGraphic.xml")));
            System.out.printf("ZAWARTOSC PLIKU : \n");
            System.out.print(contents);
        }
        catch(IOException e){
            System.out.println("Błąd wczytywania pliku :"+ e.getLocalizedMessage());
            e.printStackTrace();
        }
    }


}
