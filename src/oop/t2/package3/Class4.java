package oop.t2.package3;

import oop.t2.package2.Class1;

public class Class4 extends Class1 {

    public void showClass4Properties() {

        System.out.println(number1);
        //System.out.println(number2); - another package
        System.out.println(number3);
        // System.out.println(number4); - private

        showNumber1();
        //showNumber2(); - another package
        showNumber3();
        //showNumber4(); - private

    }

}
