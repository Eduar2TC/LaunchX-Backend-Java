package multiTask;
public class MultiTask extends Thread {
    @Override
    public void run() {
        System.out.println("Tarea unno en Thread");

    }

    public static void main(String[] args) {
      /*  MultiTask multiTask = new MultiTask(),
                multiTask2 = new MultiTask(),
                multiTask3 = new MultiTask();
        multiTask.start();
        multiTask2.start();
        multiTask3.start();
        */
    }
}
class  TaskA extends  Thread{
    @Override
    public void run() {
        System.out.println("Tarea A en Runnable");
    }
}
class  TaskB extends  Thread{
    @Override
    public void run() {
        System.out.println("Tarea B en Runnable");
    }
}
class MultiTasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea uno en Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread( new MultiTasking() );
        Thread thread1 = new Thread( new MultiTasking() );
        thread.start();
        thread1.start();
        //Tasks
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();
        taskA.start();
        taskB.start();
    }
}
