import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    ArrayList<Personaje> personajes;
    ArrayList<Ball> balls;
    public Drawing( ArrayList<Personaje> personajes, ArrayList<Ball> balls ){
        this.personajes = personajes;
        this.balls = balls;
    }
    public Drawing(){
    }
    private void moveBall() {
        /*x = x + 1;
        y = y + 1;
        x = (int) (x + 0.5 * (int) (Math.round(10 + (1 * Math.cos(angle)))));
        y = (int) (y + 0.5 * (int) (Math.round(10 + (1 * Math.sin(angle)))));*/

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for( Ball ball : this.balls ){
            ball.moveBall();
            g2d.fillOval( ball.getX(), ball.getY(), 30, 30 );
        }
        for( Personaje personaje : personajes ){
            g.drawImage( personaje.getImagen(), personaje.getX(), personaje.getY(), 100, 100, this);
            g.setFont(new Font( "Helvetica", Font.BOLD, 15 ));
            g.drawString( personaje.getNombre(), personaje.getX(), personaje.getY() + personaje.getImagen().getHeight(this) / 2 );
        }
    }
    public void jFrame( JFrame jFrame) {
        jFrame.setSize(500, 500);
        jFrame.getContentPane().setBackground(Color.WHITE);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initWindow() throws InterruptedException {
        JFrame frame = new JFrame("SpiderVerse!");
        Drawing drawing = new Drawing( this.personajes, this.balls );
        frame.add(drawing);
        drawing.jFrame( frame );
        drawing.InitializeJPanel();

        while (true) {
            drawing.repaint();
            Thread.sleep(20);
        }
    }
    public void InitializeJPanel(){
        this.setBackground(Color.white);
    }
}