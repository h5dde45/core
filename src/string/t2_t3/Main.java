package string.t2_t3;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {


        int i = 0;
        Object i3=null;
        System.out.println(Integer.toString(i));
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(i3));

        double d=1/3.0;
        System.out.println(d);
        System.out.printf("%7.2f %n",d);
        System.out.printf(String.format(Locale.ENGLISH,"%7.3f %n",d));

        int a=19;
        System.out.println(a);
        System.out.printf("%o %n",a);
        System.out.printf("%x %n",a);

    }

}
