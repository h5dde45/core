package string.t1;

public class Main {
    public static void main(String[] args) {

        String s1="New test";
        String s2=new String(new char[]{'N','e','w',' ','t','e','s','t'});
        String s3=new String(new char[]{'N','e','w',' ','t','e','s','t'},1,6);

        System.out.println(s1);
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s2);
        System.out.println(s2+" =======");
        System.out.println(s3);
        System.out.println(s3.charAt(s3.length()-2));
        System.out.println(s3.length());
        System.out.println(String.join("==",s2,s3));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals("ew tes"));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo("Rt"));
        System.out.println(s2.compareTo("Art"));
        System.out.println(s2.compareToIgnoreCase("art"));
        System.out.println(s1.replace("ew","we"));
        System.out.println(s1.replace('s','k'));
        System.out.println(s1);

        String s4="   kjewrf  kwrej kkjjnr   ";
        System.out.println(s4.trim());
        System.out.println(s4);
    }

}
