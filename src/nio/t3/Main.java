package nio.t3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //#1
        int length;

        try (SeekableByteChannel channel = Files.newByteChannel(Paths.get("src/nio/t3/file.txt"))) {
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do {
                length = channel.read(buffer);

                if (length != -1) {
                    buffer.rewind();
                    for (int i = 0; i < length; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (length != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n===========================");

        //#2
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("src/nio/t3/file.txt"))) {
            MappedByteBuffer buffer=channel.map(FileChannel.MapMode.READ_ONLY,0,channel.size());
            for (int i = 0; i < channel.size(); i++) {
                System.out.print((char) buffer.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
