public class SpiderGwen extends Personaje implements AccionesHeroe {

    public SpiderGwen(String nombre, char genero, float altura, float peso, String universo, short energia, short habilidadDeLucha, short inteligencia, short velocidad, short fuerza, short edad, float salud, String path, int x, int y) {
        super(nombre, genero, altura, peso, universo, energia, habilidadDeLucha, inteligencia, velocidad, fuerza, edad, salud, path, x, y);
    }
    public void tocarLaBateria(){
        System.out.println( "Hola soy " + this.getNombre() + "Estoy tocando la bateria");
    }

    @Override
    public void lanzarTelaranias() {
        System.out.println("Hola soy " + this.getNombre() + " estoy lanzando telaranias " );
    }

    @Override
    public void treparMuro() {
        System.out.println(this.getNombre() + " soy una chica trepada en el muro " );
    }

    @Override
    public void darPunietazo(Villano villano) {
        villano.setSalud( 3 );
    }

    @Override
    public void darPatada(Villano villano) {
        villano.setSalud( 4 );
    }

    @Override
    public void hablar() {
        System.out.println("Spiderman soy " + this.getNombre() + " eres un inutil XD");
    }
}
