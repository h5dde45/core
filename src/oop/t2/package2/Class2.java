package oop.t2.package2;

public class Class2 {
    public static void main(String[] args) {

        Class1 class1 = new Class1();

        System.out.println(class1.number1);
        System.out.println(class1.number2);
        System.out.println(class1.number3);
       // System.out.println(class1.number4); - private

        class1.showNumber1();
        class1.showNumber2();
        class1.showNumber3();
        //class1.showNumber4(); - private

    }
}
