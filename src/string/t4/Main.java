package string.t4;

public class Main {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();

        buffer.append("strbuff");
        System.out.println(buffer);

        StringBuffer buffer1=new StringBuffer("New test text");
        buffer1.delete(3,7);
        System.out.println(buffer1);

        buffer1.insert(buffer1.length()-5,buffer);
        System.out.println(buffer1);

        buffer1.replace(1, buffer1.length()-5, String.valueOf(buffer));
        System.out.println(buffer1);

        buffer1.reverse();
        System.out.println(buffer1);



    }
}
