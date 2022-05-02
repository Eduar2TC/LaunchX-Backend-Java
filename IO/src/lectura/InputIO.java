package lectura;

import java.io.FileInputStream;
import java.io.IOException;

public class InputIO {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\hola.txt");
            //Lee un caracter
            int letra = fileInputStream.read();
            System.out.println(((char) letra));
            for ( int i = fileInputStream.read(); i != -1; i = fileInputStream.read() ){
                System.out.print(((char) i));
            }
            fileInputStream.close();
        }catch ( IOException ioException){
            System.out.println( ioException.getMessage() );
        }
    }
}
