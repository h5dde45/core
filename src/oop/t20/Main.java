package oop.t20;

public class Main {
    public static void main(String[] args) {
        Task  task=new Task(){
            @Override
            public void run() {
                System.out.println("main");
            }
        };
        task.run();
        System.out.println(task);
        System.out.println(task.getClass());

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                super.run();
            }

            @Override
            public void stop() {
                System.out.println("********");
            }
        };
        runnable.run();
        runnable.stop();
        System.out.println(runnable.getClass().toString());
    }
}
