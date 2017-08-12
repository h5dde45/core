package io.t4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text="some text***";
        byte[] bytes=text.getBytes();


        try(FileOutputStream outputStream = new FileOutputStream(
                "src/io/t4/text.txt")){
            for (byte b:bytes){
                outputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
