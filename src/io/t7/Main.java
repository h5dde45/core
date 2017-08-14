package io.t7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream istream=new FileInputStream("src/io/t5/output.txt")){
            File dir=new File("src/io/t7/folder");
            if(!dir.exists()){
                dir.mkdir();
            }
            try (FileOutputStream ostream=new FileOutputStream(
                    "src/io/t7/folder/input.txt")){
                byte[]bytes=new byte[istream.available()];
                int length;
                while ((length=istream.read(bytes))!=-1){
                    ostream.write(bytes,0,length);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
