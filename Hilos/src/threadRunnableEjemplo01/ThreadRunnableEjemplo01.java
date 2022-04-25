package threadRunnableEjemplo01;

public class ThreadRunnableEjemplo01 implements Runnable{
    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ){
            try{
                Thread.sleep(1500);
                System.out.println( i );
            }catch ( InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
