package oop.t11;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sample sample=new Sample("===");
        Sample sample2=sample.clone();

        sample2.setTest("*****");

        System.out.println(sample.getTest());
        System.out.println(sample2.getTest());


    }
}
