package oop.t7.interfaces;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[]{
                new Computer("first"),
                new Computer("second"),
                new Computer("third")
        };

        for (Computer computer : computers) {
            computer.turnOn();
        }

        System.out.println(">>");
        Scanner scanner=new Scanner(System.in);
        String cache=scanner.nextLine();

        if (Objects.equals(cache, "Y")) {
            System.out.println("Y");
            for (Computer computer : computers) {
                computer.turnOff();
            }
        } else if (Objects.equals(cache, "N")) {
            System.out.println("N");
        } else
            System.out.println("=======");
    }
}
