/*No es posible extender desde una clase padre sin que la clase hija tenga la */
/*Herencia ejemplo 1*/
class Persona {
    private int id;
    private String nombre;
    public Persona( int id, String nombre ){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
public class Empleado extends Persona {
    private double salario;
    public Empleado( int id, String nombre, double salario ){
        super(id, nombre);
        this.salario = salario;
    }
    public void show(){
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.salario);
    }
}
class Main{
    public static void main(String[] args) {
        Empleado empleado = new Empleado( 1, "Pepe", 4570.50 );
        empleado.show();
    }
}