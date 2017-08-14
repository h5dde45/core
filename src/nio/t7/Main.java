package nio.t7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) throws IOException {
        Path sourcePath= Paths.get("file.txt");
        Path destinationPath= Paths.get("src/nio/t7/file.txt");

//        try {
//            Files.copy(destinationPath,sourcePath);
//            Files.move(sourcePath,destinationPath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(destinationPath.getFileName());
        System.out.println(destinationPath);
        System.out.println(Files.exists(destinationPath));
        System.out.println(Files.isHidden(destinationPath));
        System.out.println(Files.isReadable(destinationPath));
        System.out.println(Files.isWritable(destinationPath));

        BasicFileAttributes fileAttributes=Files.readAttributes(destinationPath,BasicFileAttributes.class);

        System.out.println(fileAttributes.isDirectory());
        System.out.println(fileAttributes.isRegularFile());
        System.out.println(fileAttributes.isSymbolicLink());
        System.out.println(fileAttributes.lastAccessTime());
        System.out.println(fileAttributes.size());

    }
}
