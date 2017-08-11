package oop.t10;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample("test");
        Sample sample2 = new Sample("test");
        System.out.println(sample.getClass());
        System.out.println(sample.hashCode()+" "+Integer.toHexString(sample2.hashCode()));

        System.out.println(sample.equals(sample2));

        System.out.println(sample.toString());

    }
}
