package oop.t12;

public class Factorial {

      public static int getFactorial(int i) throws FactorialException {
        if (i < 0) throw new FactorialException("<0",i);
        int r = 1;
        for (; i > 0; r *= i--) ;
        return r;
    }

}
