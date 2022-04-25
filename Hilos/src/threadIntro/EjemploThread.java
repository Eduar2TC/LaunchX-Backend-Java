package threadIntro;

class EjemploRunnable implements Runnable{
    @Override
    public void run() {
        //Redefinición del comportamiento para el hilo
        System.out.println("Hilo en ejecución en Runnable");
    }
}

public class EjemploThread extends Thread{
    //Estado : Runnabe
    @Override
    public void run() {
        //Redefinición del comportamiento para el hilo
        System.out.println("Hilo en ejecución");
    }
    /*
    *start() -> Inicial la ejecución de un hilo. La JVM llama al método run del hilo implementadad en la clase Runnable
    * sleep() -> Detiene de manera temporal
    * join() -> Espera a que un hilo
    * getPriority() -> Regresa la prioridad del hilo
    * setPriority -> Establece la prioridad de un hilo
    * getName -> Retorna el nombre del hilo
    * getId() -> Obtiene el id del hilo
    * currentThread() -> Referencia al hilo que se esta ejecutando
    * Thread.State getState -> Regresa el estado actual
    * isAlive() -> Regresa si el hilo esta vivo
     */
    public static void main(String[] args) {
        //Ciclo de vida New ->> Start -> Runnable -> Running -> Terminate
        //Estado : New
        EjemploThread hilo = new EjemploThread();
        hilo.start();
        //Hilo implenmentado desde la interfaz Runnable
                    EjemploRunnable runnable = new EjemploRunnable();
        /*New*/     Thread thread = new Thread( runnable ); //El objeto runnable incluye al metodo run
        /*Runnable*/thread.start();
    }
}
