import java.awt.*;

public class HelloWorldUI {

    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog dialog = new Dialog();
        screen.setBounds( 20, 20, 300, 300 );

        screen.setVisible(true);

        String respuesta = dialog.readString("Continuar S/N");

        if(  respuesta.charAt(0) == 'S' || respuesta.charAt(0) == 's'){

            dialog.display("Elegiste : " + respuesta);

        } else if( respuesta.charAt(0) == 'N' || respuesta.charAt(0) == 'n' ){
           dialog.display("Elegiste : " + respuesta);
        }else{
            screen.out("Adios", "Helvetica", 20, Color.DARK_GRAY);
            screen.setVisible(false);
        }
    }

}
