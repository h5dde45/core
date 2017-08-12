package oop.t18;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int[] ints = new int[]{4, 2, 8, 5, 7};

        for (int i : ints) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove()+" ");
        }
        System.out.println();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println("*******************");
        System.out.println("*******************\n");

        PriorityQueue <Integer> priorityQ=new PriorityQueue<>();
        for (int i : ints) {
            priorityQ.offer(i);
        }
        System.out.println(priorityQ);

        System.out.println("*******************");
        System.out.println("*******************\n");

        Comparator<Integer> comparator=(v1,v2) -> {
            if(v1>v2) return -1;
            if(v1<v2) return 1;
            return 0;
        };
        PriorityQueue <Integer> priorityQ2=new PriorityQueue<>();
        Integer[] ints2 = new Integer[]{4, 2, 8, 5, 7};
        Collections.addAll(priorityQ2,ints2);

        System.out.println(priorityQ2);
        Integer[] ints3=new Integer[5];
        priorityQ2.toArray(ints3);
        Arrays.sort(ints3,comparator);
        System.out.println(Arrays.toString(ints3));

    }
}
