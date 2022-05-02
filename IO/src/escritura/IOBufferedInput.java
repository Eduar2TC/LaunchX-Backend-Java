package escritura;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOBufferedInput {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("c:\\hola-2.txt");
            BufferedInputStream bufferedInputStream =
                    new BufferedInputStream( fileInputStream );
            for( int i = 0; i != -1; i = bufferedInputStream.read()  ){
                System.out.print(((char) i));
            }
            bufferedInputStream.close();
            fileInputStream.close();
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

    }
}
