public class SpiderAfro extends Personaje implements AccionesHeroe {

    public SpiderAfro(String nombre, char genero, float altura, float peso, String universo, short energia, short habilidadDeLucha, short inteligencia, short velocidad, short fuerza, short edad, float salud, String path, int x, int y) {
        super(nombre, genero, altura, peso, universo, energia, habilidadDeLucha, inteligencia, velocidad, fuerza, edad, salud, path, x, y);
    }
    public void hacerseInvicible(){
        System.out.println("Ya soy invicible");
    }

    @Override
    public void lanzarTelaranias() {
        System.out.println(this.getNombre() + " lanzando telarañas " );
    }

    @Override
    public void treparMuro() {
        System.out.println( this.getNombre() + " trepado en un muro ");
    }

    @Override
    public void darPunietazo(Villano villano) {
        villano.setSalud( 2 );
    }

    @Override
    public void darPatada(Villano villano) {
        villano.setSalud( 5 );
    }

    @Override
    public void hablar() {
        System.out.println( "Hola soy " + this.getNombre() + " estoy aprendiendo"  );
    }

}