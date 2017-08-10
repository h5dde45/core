package oop.t5;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Nokia phone = new Nokia();
        phone.model = "Nokia 23";

        if (Objects.equals(phone.getModel(), "Nokia 23")) {
            new Main().getResult(phone.getErrorMessage());
        } else {
            new Main().getResult(phone.getSuccessMessage());
        }

    }

    private void getResult(String s) {
        System.out.println(s);
    }
}
