package oop.t7.interfaces;

public class Computer implements Status {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name+" ON");
    }

    @Override
    public void turnOff() {
        System.out.println(name+" OFF");
    }
}
