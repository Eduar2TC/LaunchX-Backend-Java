import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Personaje implements PositionDetails {
    private String nombre;
    private char genero;
    private double altura;
    private float peso;
    private String universo;
    //Atributos multiverso
    private short energia;
    private short habilidadDeLucha;
    private short inteligencia;
    private short velocidad;
    private short fuerza;
    private short edad;
    private float salud;
    //UI Posiciones
    private Image imagen;
    private int x;
    private int y;
    public Personaje(
            String nombre,
            char genero,
            double altura,
            float peso,
            String universo,
            short energia,
            short habilidadDeLucha,
            short inteligencia,
            short velocidad,
            short fuerza,
            short edad,
            float salud,
            String path,
            int x,
            int y
            ){
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.universo = universo;
        this.energia = energia;
        this.habilidadDeLucha = habilidadDeLucha;
        this.inteligencia = inteligencia;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.edad = edad;
        this.salud = salud;
        this.setImagen( path );
        this.x = x;
        this.y = y;
    }

    public String getNombre(){
        return this.nombre;
    }
    public char getGenero(){
        return this.genero;
    }
    public double getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getUniverso(){
        return this.universo;
    }
    public short getHabilidadDeLucha(){
        return this.habilidadDeLucha;
    }
    public short getInteligencia(){ return this.inteligencia;}
    public short getVelocidad(){ return this.velocidad; }
    public short getFuerza(){ return this.fuerza; }
    public short getEdad(){ return this.edad; }
    public float getSalud(){ return this.salud; }
    public Image getImagen(){ return this.imagen; }
    public void setSalud( float salud ){
        this.salud -= salud;
    }
    //UI Detalles

    @Override
    public void setImagen(String path) {
        try {
            this.imagen = ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
}
