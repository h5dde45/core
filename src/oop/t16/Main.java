package oop.t16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(22);
        arrayList.add(26);

        System.out.println(arrayList);
        arrayList.add(1,65);
        arrayList.add(1,35);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(12);
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);

        arrayList2.set(2,111);
        System.out.println(arrayList2);
        System.out.println(arrayList2.get(3));
        System.out.println(arrayList2.remove(2));
        System.out.println(arrayList2);
        System.out.println("***************************");
        System.out.println("***************************\n");

        LinkedList<String> linkedList=new LinkedList<>();
        String[]strings=new String[]{"gg","ffff","3333"};
        Collections.addAll(linkedList,strings);
        System.out.println(linkedList);
        linkedList.addFirst("zzz");
        System.out.println(linkedList);
        linkedList.addLast("kkkkk");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);


    }
}
