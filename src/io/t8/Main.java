package io.t8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "new message";
        char[] chars = new char[s.length()];

        s.getChars(0, chars.length, chars, 0);

        try (FileWriter writer = new FileWriter("src/io/t8/wfile.txt")) {
            for (char c : chars) {
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
