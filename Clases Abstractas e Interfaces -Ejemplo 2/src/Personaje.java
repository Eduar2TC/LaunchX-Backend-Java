abstract class Sombra{
    abstract void dibujarSombra();
}
class Arma extends Sombra {
    public void dibujarSombra(){
        System.out.println("Dibujando sombra requerida por la clase abstracta");
    }
}
public class Personaje extends Arma{
    @Override
    public void dibujarSombra() {
        System.out.println("Dibujando sombra personalizada para el personaje requerida por la clase abstracta no por herencia");
    }

    public static void main(String[] args) {
        Sombra flecha = new Personaje(); //Personaje extiende de arma y Arma implementa el método abstracto requerido por Sombra
        Sombra arco = new Arma();
        flecha.dibujarSombra();
        arco.dibujarSombra();
    }
}
