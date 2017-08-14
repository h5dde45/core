package io.t6;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream stream=new FileInputStream("src/io/t5/output.txt")){
            int simbol;
            while ((simbol=stream.read())!=-1){
                System.out.print((char) simbol);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
