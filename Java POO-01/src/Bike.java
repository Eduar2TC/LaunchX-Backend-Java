/*
 * Overload: Sobreacarga de metodos
 * Override: Redifinición de un método
 * Override: Sobreescritura de un método
 * */

/*Ejemplo de Overloading*/

public class Bike {
    private int velocity;
    private String color;
    private String brand;
    public Bike(){

    }
    public Bike(String color){
        this.color = color;
    }
    public Bike( String color, int velocity ){
        this.color = color;
        this.velocity = velocity;
    }
    public Bike( String color, int velocity, String brand ){
        this.color = color;
        this.velocity = velocity;
        this.brand = brand;
    }
    public int getVelocity(){ return this.velocity; }
    public String getColor(){ return this.color; }
    public String getBrand(){ return this.brand; }



}
