package oop.t9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("aaa", Faculty.FOURTH);
        System.out.println(student.faculty.ordinal());

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-3: ");

        int choice = scanner.nextInt()-1;
        Faculty faculty = Faculty.values()[choice];

        switch (faculty){
            case FIRST:
                System.out.println("1111");
                break;
            case SECOND:
                System.out.println("2222");
                break;
            case THIRD:
                System.out.println("3333");
                break;
        }


    }
}
