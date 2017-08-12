package oop.t17;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(443,"fff");
        hashMap.put(31,"kkk");
        hashMap.put(23,"ggg");
        hashMap.put(71,"ttt");

        System.out.println(hashMap);
        System.out.println(hashMap.get(23));
        System.out.println(hashMap.replace(31,"oooo**"));
        System.out.println(hashMap);

        System.out.println(hashMap.remove(443));
        System.out.println(hashMap);
        System.out.println("*****************");
        System.out.println("*****************\n");

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(34,"r");
        linkedHashMap.put(12,"sss");
        linkedHashMap.put(111,null);
        linkedHashMap.put(314,"6785");
        System.out.println(linkedHashMap);

        for(Map.Entry<Integer,String> entry:linkedHashMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

        System.out.println("*****************");
        System.out.println("*****************\n");

        TreeMap<Integer,String> treeMap=new TreeMap<>();
        int[]keys=new int[]{2,6,4,5,1,3};
        String[] values=new String[]{"hhh","g","dd","ee","ww","++++"};

        for(int i=0;i<keys.length;i++){
            treeMap.put(keys[i],values[i]);
        }
        for (Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

        System.out.println(treeMap.headMap(3));
        System.out.println(treeMap.tailMap(3));
        System.out.println(treeMap.descendingMap());

    }

}
