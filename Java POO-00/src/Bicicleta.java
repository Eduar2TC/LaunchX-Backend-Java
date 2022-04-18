import java.text.MessageFormat;

public class Bicicleta {

    private int pins;
    private int rodada;
    private double velocidad;
    private String color;
    public int getPins(){ return this.pins; }
    public int getRodada(){ return this.rodada; }
    public double getVelocidad(){ return this.velocidad; }
    public String getColor(){ return this.color; }

    public Bicicleta(){

    }

    public boolean setRodada(int rodada) {
        if( rodada >= 12 && rodada <= 26 ){
            this.rodada = rodada;
            return true;
        }else{
            this.rodada = 12;
            return false;
        }
    }
    public boolean setPines(int pins){
        if ( pins > 0 ){
            this.pins = pins;
            return true;
        }else return  false;
    }
    public boolean setVelocidad( double velocidad ){
        if( velocidad >= 0 ){
            this.velocidad = velocidad;
            return  true;
        }
        return  false;
    }
    public boolean setColor( String color ){
        if( !color.isEmpty() ){
            this.color = color;
            return true;
        }else{
            this.color = "Indefinido";
        return false;
        }
    }
    public String printState(){
        return "rodada : " + this.rodada + "\n" +
                "pins : " + this.pins + "\n" +
                "velocidad : " + this.velocidad
                ;
    }
}
