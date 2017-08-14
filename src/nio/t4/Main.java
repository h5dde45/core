package nio.t4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {

        try {
            Path sourcePath = Paths.get("src/nio/t4/input.txt");
            Path destinationPath = Paths.get("src/nio/t4/output.txt");

            Files.copy(sourcePath,destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
