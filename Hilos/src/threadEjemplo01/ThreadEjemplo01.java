package threadEjemplo01;
import threadRunnableEjemplo01.ThreadRunnableEjemplo01;

public class ThreadEjemplo01 extends Thread{
    @Override
    public void run() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for( int i : array ){
            try {
                Thread.sleep(500);
                System.out.println( i );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadEjemplo01 threadEjemplo01 = new ThreadEjemplo01();
        threadEjemplo01.start();

        ThreadRunnableEjemplo01 threadRunnableEjemplo01 = new ThreadRunnableEjemplo01();
        Thread threadEnRunnable = new Thread(threadRunnableEjemplo01);
        threadEnRunnable.start();


    }
}
