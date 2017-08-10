package oop.t6;

public class Main {
    public static void main(String[] args) {

        C1[] c1 = new C1[]{new C2(), new C3(), new C4(), new C5()};

        for (C1 c:c1){
            c.getValue();
        }

    }
}
