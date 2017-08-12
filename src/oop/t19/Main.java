package oop.t19;

public class Main {
    public static void main(String[] args) {
        App app=new App();
        app.start();
        app.addAppGUI();
        app.addCore();

        AppGUI app2=new App();
        app.start();
        app.addAppGUI();
        app.addCore();

    }
}
