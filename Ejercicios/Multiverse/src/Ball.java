public class Ball implements PositionDetails {
    private int x;
    private int y;
    private double angulo;
    private final double velocidad;

    public Ball( Personaje personaje, Villano villano, double velocidad ){
        //init x, y Ball from img position
        this.x = personaje.getX();
        this.y = personaje.getY();
        this.angulo = Math.toDegrees( Math.atan2( villano.getY() - personaje.getY(), villano.getX() -  personaje.getX()) ); //y2 -y1, x2 -x1
        if( this.angulo < 0){
            this.angulo += 360;
        }
        this.velocidad = velocidad; // [0, 1]
    }
    public void moveBall(){
        this.x = (int) ( this.x + velocidad * (int) (Math.round(Math.toDegrees( Math.cos(angulo)))));
        this.y = (int) ( this.y + velocidad * (int) (Math.round(Math.toDegrees(Math.sin(angulo)))));

    }
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public void setImagen(String path) {

    }

}
