package escritura;

import java.io.FileInputStream;
import java.io.IOException;

public class IORunnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {
                    FileInputStream fileInputStream = new FileInputStream("C:\\hola.txt");
                    //Lectura del primer caracter
                    int letra = fileInputStream.read();
                    System.out.println(((char) letra));
                    //Lectura de cadena
                    for ( int i = fileInputStream.read(); i != -1; i = fileInputStream.read() ){
                        System.out.print(((char) i));
                    }
                    fileInputStream.close();
                }catch ( IOException ioException){
                    System.out.println( ioException.getMessage() );
                }

            }
        };
        Thread thread = new Thread( runnable );
        thread.start();
    }
}
