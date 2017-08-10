package string.t5;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] strings=new String[]{"ddd","regt","hutyfaq","gr","Dtkk"};

        for (String s:strings){
            System.out.println(s);
        }
        System.out.println("==============================");

//        Arrays.sort(strings);

        List<String> list=new ArrayList<>();
        Collections.addAll(list,strings);
        Collections.sort(list);

        for (String s:list){
            System.out.println(s);
        }
        System.out.println("==============================");
        System.out.println(list);
        System.out.println("==============================");
        list.forEach(System.out::println);
        System.out.println("==============================");
        System.out.println("==============================");

        String[] strings1=new String[]{"П","Ё","Ы","С","И","О","Ш","П","А"};

//        Arrays.sort(strings1);
//        for (String s:strings1){
//            System.out.println(s);
//        }

        Collator collator=Collator.getInstance(new Locale("ru"));

        List<String> list2=new ArrayList<>();
        Collections.addAll(list2,strings1);
        Collections.sort(list2,collator);
        list2.forEach(System.out::println);
        System.out.println("==============================");



    }
}
