import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void drawCanvas( JFrame jframe ){
      /*  Canvas canvas = new Canvas();
        JFrame jframe = new JFrame("Canvas");

        try{
            Image image = ImageIO.read(new File("./assets/spidy.png"));
            jframe.getGraphics().drawImage(image, 0, 0, null);
            jframe.add(canvas);

        }catch(IOException ioException){
            System.out.println(ioException.getMessage());
        }

       */
        //JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Canvas();
        canvas.setSize(400, 400);
        jframe.add(canvas);
        jframe.pack();
        jframe.setVisible(true);
    }
    public static void initConfigurationWindow() {
        try{
            Image imageIcon = ImageIO.read(new File("./assets/icon.png"));
            Screen screen = new Screen(
                    "Spider Verse"
            );
            screen.setIconImage( imageIcon );
            screen.setVisible(true);
            Dialog dialog = new Dialog();
            dialog.display("Hola");

        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        //Init heroes, villano y pelota
        SpiderMan peter = new SpiderMan( "Peter Parker", 'H', 1.80f, 75.0f, "Tierra33", (short) 100, (short) 100, (short) 100, (short) 100, (short) 100, (short) 25, 100.0f, "./assets/spider.jpg", 10, 150 );
        SpiderGwen gwen = new SpiderGwen("Gwen Stacy", 'M', 1.70f, 55.0f, "Tierra20", (short) 100, (short) 100, (short) 100, (short) 100, (short) 100, (short) 20, 100.0f, "./assets/gwen.jpg", 10, 10);
        SpiderAfro morales = new SpiderAfro( "Morales", 'H', 1.60f, 45.0f, "Tierra45", (short) 100, (short) 100, (short) 100, (short) 100, (short) 100, (short) 15, 100.0f, "./assets/morales.png", 10, 300 );
        Villano kingPin = new Villano("King pin", 'H', 2.0f, 100.0f, "Tierra33", (short) 100, (short) 100, (short) 100, (short) 100, (short) 100, (short) 55, 100.0f, "./assets/kingpin.png", 300, 150  );
        Ball ball0 = new Ball(peter, kingPin, 0.2);
        Ball ball1 = new Ball(gwen, kingPin, 0.1);
        Ball ball2 = new Ball(morales, kingPin, 0.3);
        Ball ball3 = new Ball(morales, kingPin, 0.1);

        ArrayList<Personaje> personajes = new ArrayList<Personaje>();
        personajes.add(peter);
        personajes.add(gwen);
        personajes.add(morales);
        personajes.add(kingPin);

        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add(ball0);
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);

        Drawing drawing = new Drawing( personajes, balls );
        drawing.initWindow();
        //Drawing.initWindow();
    }
}
