package oop.t7.abstr;

public abstract class Figure {

    protected double width;
    protected double heigth;

    public Figure(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public void getParametr(){
        System.out.println(width+", "+heigth);
    }
    public abstract double getArea();
}
