package oop.t12;

public class Main {

    public static void main(String[] args) {
    /*    try {
            double[] array = new double[]{1,2,3,4,5};
            array[5]=33;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        System.out.println(4455);*/

       /* int m=1000;
        if(m<1111) try {
            throw new Exception("< 11111");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

      /*  try {
            System.out.println(getFactorial(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("done");*/

        try {
            System.out.println(Factorial.getFactorial(4));
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());

        }
        System.out.println("done");
    }

   /* private static int getFactorial(int i) throws Exception {
        if (i < 0) throw new Exception("<0");
        int r = 1;
        for (; i > 0; r *= i--) ;
        return r;
    }*/
}
