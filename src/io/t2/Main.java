package io.t2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path="C:\\Users/н\\Desktop/sample.txt";

        File file=new File(path);
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists()?"yes":"no");
        System.out.println(file.canWrite()?"yes":"no");
        System.out.println(file.canRead()?"yes":"no");
        System.out.println(file.isDirectory()?"directory":"file");
        System.out.println(file.isFile()?"regular file":"isn't regular");
        System.out.println(file.isHidden()?"yes":"no");
        System.out.println(CapacityFormatter.toGigabytes(
                file.getTotalSpace()));
        System.out.println(CapacityFormatter.toGigabytes(
                file.getFreeSpace()));


    }
    private static class CapacityFormatter{
        private static long toGigabytes(long capacity){
            return capacity/(long)Math.pow(10,9);
        }
    }
}
