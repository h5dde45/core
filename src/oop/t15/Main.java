package oop.t15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet=new TreeSet<>();

        int[]array=new int[]{5,6,4,3,7,8,2,9,1};

        for(Integer integer:array){
            sortedSet.add(integer);
        }
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println("=======================");
        System.out.println(sortedSet.subSet(2,7));
        System.out.println(sortedSet.subSet(2,7).first());
        System.out.println(sortedSet.subSet(2,7).last());
        System.out.println("=======================");
        System.out.println(sortedSet.headSet(4));
        System.out.println(sortedSet.tailSet(4));
        System.out.println("=======================");
        System.out.println("=======================");

        SortedSet<Integer> subset=sortedSet.subSet(2,7);
        System.out.println(subset);
        System.out.println(subset.first());
        System.out.println(subset.last());
        System.out.println("=======================");
        System.out.println("*********************************\n");

        NavigableSet<Integer> navigableSet=new TreeSet<>();
        for(Integer integer:array){
            navigableSet.add(integer);
        }
        System.out.println(navigableSet);
        System.out.println(navigableSet.lower(6));
        System.out.println(navigableSet.higher(6));
        System.out.println(navigableSet.higher(9));
        System.out.println(navigableSet.floor(9));
        System.out.println(navigableSet.ceiling(2));
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet);

        Iterator iterator=navigableSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        iterator=navigableSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(navigableSet.descendingSet());
        System.out.println("=======================");
        System.out.println("*********************************\n");

        TreeSet<Integer> treeSet=new TreeSet<>();
        for(Integer integer:array){
            treeSet.add(integer);
        }
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        int c=treeSet.size()/2;
        for(int i=0;i<c;i++){
            treeSet.remove(treeSet.first());
        }
        System.out.println(treeSet);
        System.out.println("=======================");
        System.out.println("*********************************\n");

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        LinkedHashSet<Integer> linkedHashSet2=new LinkedHashSet<>();
        for(Integer integer:array){
            linkedHashSet.add(integer);
            linkedHashSet2.add(integer);
        }
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet2);

         iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(linkedHashSet.equals(linkedHashSet2));
        System.out.println(linkedHashSet.add(3));
        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.add(32));
        System.out.println(linkedHashSet);
        System.out.println("=======================");
        System.out.println("*********************************\n");

        Set<Integer> hashSet=new HashSet<>();
        for(Integer integer:array){
            hashSet.add(integer);
        }
        System.out.println(hashSet);

        System.out.println("\n\n");
    }
}
