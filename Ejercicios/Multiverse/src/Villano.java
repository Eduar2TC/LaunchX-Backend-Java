public class Villano extends Personaje{
    public Villano(String nombre, char genero, float altura, float peso, String universo, short energia, short habilidadDeLucha, short inteligencia, short velocidad, short fuerza, short edad, float salud, String path, int x, int y) {
        super(nombre, genero, altura, peso, universo, energia, habilidadDeLucha, inteligencia, velocidad, fuerza, edad, salud, path, x, y);
    }
    public void atacarHeroe( Personaje personaje ){
        this.setSalud(5);
    }
}
