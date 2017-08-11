package oop.t7.abstr;

public class Square extends Figure{

    public Square(double width, double heigth) {
        super(width, heigth);
    }

    @Override
    public double getArea() {
        return width*heigth;

    }
}
