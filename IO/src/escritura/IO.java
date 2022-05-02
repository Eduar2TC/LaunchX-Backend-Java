package escritura;

import java.io.FileOutputStream;
import java.io.IOException;
/*Escritura de un archivo*/
public class IO {

    public static void main(String[] args) {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    String path = "C:\\hola.txt";
                    FileOutputStream fileOutputStream = new FileOutputStream(
                            path
                    );

                    for( int i = 0; i < 128; i++ ){
                        fileOutputStream.write( i ); //assci table
                        fileOutputStream.write( 32 ); //spac
                    }
                    for( int i = 0 ; i < 5; i++ ){
                        fileOutputStream.write(10);
                    }
                    fileOutputStream.write( lorem.getBytes() );
                    fileOutputStream.close();

                }catch (IOException ioException){
                    System.out.println( ioException.getMessage() );
                }
            }
        };
        Thread thread = new Thread( runnable );
        thread.start();
    }
}
