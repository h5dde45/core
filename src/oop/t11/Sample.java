package oop.t11;

public class Sample implements Cloneable{
    String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Sample(String test) {

        this.test = test;
    }

    @Override
    protected Sample clone() throws CloneNotSupportedException {
        return (Sample) super.clone();
    }
}
