package io.t3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "src/io/t3/backup";
        File dir = new File(path);

      /*  if(!dir.exists()){
            System.out.println(dir.mkdir()?"yes":"no");
        }else {
            System.out.println("already exist..");
        }*/

        if (dir.isDirectory()) {
            String[] strings = dir.list();

            if (strings != null) {
                for (String s : strings) {
                    File file = new File(path
                            + "/" +s);
                    System.out.println(file.isDirectory()?
                            (s+" - directory"):
                            (s+" - file"));
                }
            }
        }
    }
}
