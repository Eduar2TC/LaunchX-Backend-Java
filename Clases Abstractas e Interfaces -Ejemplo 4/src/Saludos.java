abstract class Hola {
    void saludo(){
        System.out.println("Hola");
    }
    public abstract void saludoFormal();
}
interface Mostrar {
    public void mostrar(); //Metodo abstracto por defecto
    public abstract void adios();
}
public class Saludos implements Mostrar {
    public void mostrar(){
        System.out.println("Mostrando saludo");
    }
    public void adios(){
        System.out.println("Despidiendose");
    }

    public static void main(String[] args) {
        Saludos saludos = new Saludos();
        saludos.mostrar();
        saludos.adios();
    }

}
