package io.t5;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s="New text";
        byte[]bytes=s.getBytes();

        try (FileOutputStream stream=new FileOutputStream("src/io/t5/output.txt")){
            for(byte b:bytes){
                stream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
