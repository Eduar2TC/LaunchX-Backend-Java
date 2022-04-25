package join;

import java.util.ArrayList;

public class EjemploJoin extends Thread{
    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ){
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( "state: " + this.getState() + " priority : " + this.getPriority() + " " + this.getName() + " time : " +  i );
        }
    }
    public static void detalles( ArrayList<EjemploJoin> threads ){
        for( EjemploJoin hilo : threads ){
            System.out.println(
                    "Hilo : " + hilo.getName() + "\n" +
                            "id " + hilo.getId() + "\n" +
                            "state " + hilo.getState() + "\n" +
                            "priority " + hilo.getPriority()
            );
        }
    }
    public static void main(String[] args) throws InterruptedException {
        EjemploJoin ejemploJoin01 = new EjemploJoin();
        EjemploJoin ejemploJoin02 = new EjemploJoin();
        EjemploJoin ejemploJoin03 = new EjemploJoin();
        ArrayList<EjemploJoin> threads = new ArrayList<EjemploJoin>();
        threads.add(ejemploJoin01);
        threads.add(ejemploJoin02);
        threads.add(ejemploJoin03);

        detalles(threads);

        threads.get(0).start(); // Hilo 1

        try{
            threads.get(0).join( 1500 );
            threads.get(0).setName("MAXP");
            threads.get(0).setPriority(MAX_PRIORITY);
        }catch (InterruptedException e){
            e.getStackTrace();
        }

        threads.get(1).start(); // Hilo 2
        threads.get(2).start();


    }
}
