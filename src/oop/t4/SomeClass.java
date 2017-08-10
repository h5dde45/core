package oop.t4;

public class SomeClass {
    private String text1;
    private String text2;

    public SomeClass(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    private void concatenation(){
        text1+=" "+text2;
    }

    public String getText1(){
        concatenation();
        return text1;
    }

}
