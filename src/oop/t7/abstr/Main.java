package oop.t7.abstr;

public class Main {
    public static void main(String[] args) {

        Figure figure = new Square(3, 5);
        figure.getParametr();
        System.out.println(figure.getArea());
    }
}
