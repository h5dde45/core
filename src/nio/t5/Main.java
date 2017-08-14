package nio.t5;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String text = "new message";
        byte[] bytes = text.getBytes();

        try (OutputStream outputStream=new BufferedOutputStream(Files.newOutputStream(
                    Paths.get("src/nio/t5/file.txt")))){
            for(byte b: bytes){
                outputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
