package escritura;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Buffer almacena en memoria
public class IOBuferedOutput {
    public static void main(String[] args) {
        try {
            String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            FileOutputStream fileOutputStream = new FileOutputStream( "C:\\hola-2.txt" );
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream( fileOutputStream );
            byte bytes[] = lorem.getBytes();

            bufferedOutputStream.write( bytes );
            bufferedOutputStream.flush();

            bufferedOutputStream.close();
            fileOutputStream.close();
            System.out.println("Success");
        }catch ( IOException ioException){
            System.out.println( ioException.getMessage() );
        }
    }
}
