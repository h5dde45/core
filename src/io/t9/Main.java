package io.t9;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader=new FileReader("src/io/t8/wfile.txt")){
            int simbol;
            while ((simbol=reader.read())!=-1){
                System.out.print((char)simbol);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
