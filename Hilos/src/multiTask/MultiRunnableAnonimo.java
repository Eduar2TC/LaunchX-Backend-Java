package multiTask;

import threadEjemplo01.ThreadEjemplo01;

public class MultiRunnableAnonimo {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task A");
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task B");
            }
        };
        Thread thread = new Thread( runnable1 );
        Thread thread1 = new Thread( runnable2 );
        thread.start();
        thread1.start();
    }
}
