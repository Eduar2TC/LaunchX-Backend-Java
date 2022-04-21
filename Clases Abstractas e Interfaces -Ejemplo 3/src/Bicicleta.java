abstract class Montania {
    public Montania(){
        System.out.println("Se há fabricado una nueva biclicleta");
    }
    abstract void cambiarVelocidad(); //Metodo abstracto
    public void cambiarColor(){
        System.out.println("Cambiando color en la bicicleta de montaña");
    }
}
class Magistroni extends Montania {
    void cambiarVelocidad(){
        System.out.println("Cambiando propiedades de la velocidad");
    }
}
public class Bicicleta{
    void cambiarVelocidad(){
        System.out.println("Cambiando propiedad de velocidad en una bicicleta genérica");
    }
    public static void main(String[] args) {
        Montania montania = new Magistroni();
        montania.cambiarVelocidad();
        montania.cambiarColor();
    }
}

