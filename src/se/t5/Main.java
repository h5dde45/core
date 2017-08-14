package se.t5;

public class Main {
    static byte fByte, sByte;
    static short fShort, sShort;
    static int fInteger, sInteger;
    static long fLong, sLong;
    static float fFloat, sFloat;
    static double fDouble, sDouble;
    static char fChar,sChar,tChar;
    static boolean f,t;
    static String fStr,sStr;

    public static void main(String[] args) {
        fByte = Byte.MIN_VALUE;
        sByte = Byte.MAX_VALUE;
        System.out.println(fByte);
        System.out.println(sByte);
        System.out.println(Byte.BYTES);
        System.out.println("===================");

        fShort=Short.MIN_VALUE;
        sShort=Short.MAX_VALUE;
        System.out.println(fShort);
        System.out.println(sShort);
        System.out.println(Short.BYTES);
        System.out.println("===================");

        fInteger=Integer.MIN_VALUE;
        sInteger=Integer.MAX_VALUE;
        System.out.println(fInteger);
        System.out.println(sInteger);
        System.out.println(Integer.BYTES);
        System.out.println("===================");

        fLong=Long.MIN_VALUE;
        sLong=Long.MAX_VALUE;
        System.out.println(fLong);
        System.out.println(sLong);
        System.out.println(Long.BYTES);
        System.out.println("===================");

        fFloat=Float.MIN_VALUE;
        sFloat=Float.MAX_VALUE;
        System.out.println(fFloat);
        System.out.println(sFloat);
        System.out.println(Float.BYTES);
        System.out.println("===================");

        fDouble=Double.MIN_VALUE;
        sDouble=Double.MAX_VALUE;
        System.out.println(fDouble);
        System.out.println(sDouble);
        System.out.println(Double.BYTES);
        System.out.println("===================");

        fChar=Character.MIN_VALUE;
        sChar=Character.MAX_VALUE;
        tChar='r';
        System.out.println(fChar);
        System.out.println(sChar);
        System.out.println(tChar);
        System.out.println(Character.BYTES);
        System.out.println("===================");

        f=false;
        t=true;
        System.out.println(""+f+t+(2>9));
        System.out.println("===================");

        System.out.println(fStr);
        fStr="new text";
        sStr=fStr;
        System.out.println(fStr);
        System.out.println(sStr);

    }
}
