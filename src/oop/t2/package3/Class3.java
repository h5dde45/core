package oop.t2.package3;

import oop.t2.package2.Class1;

public class Class3 {

    public void showClass3Properties() {
        Class1 class1 = new Class1();

        System.out.println(class1.number1);
        //System.out.println(class1.number2); - another package
        //System.out.println(class1.number3); - not a child
        // System.out.println(class1.number4); - private

        class1.showNumber1();
        //class1.showNumber2(); - another package
        //class1.showNumber3(); - not a child
        //class1.showNumber4(); - private

    }

}
