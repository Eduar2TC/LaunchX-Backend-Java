public class SpiderMan extends Personaje implements AccionesHeroe  {

    public SpiderMan(String nombre, char genero, float altura, float peso, String universo, short energia, short habilidadDeLucha, short inteligencia, short velocidad, short fuerza, short edad, float salud, String path, int x, int y) {
        super(nombre, genero, altura, peso, universo, energia, habilidadDeLucha, inteligencia, velocidad, fuerza, edad, salud, path, x, y);
    }
    public void tomarFotografias(){
        System.out.println("Hola soy " +this.getNombre()+ "Estoy tomando fotos");
    }

    @Override
    public void lanzarTelaranias() {
        System.out.println("Hola soy " + this.getNombre() + " estoy lanzando telaranias " );
    }

    @Override
    public void treparMuro() {
        System.out.println(this.getNombre() + " estoy trepado en el muro " );
    }

    @Override
    public void darPunietazo( Villano villano ) {
        villano.setSalud( 5 );
    }

    @Override
    public void darPatada( Villano villano ) {
        villano.setSalud( 10 );
    }

    @Override
    public void hablar() {
        System.out.println("Soy " +this.getNombre()+ "y golpeo a los malos ");
    }
}
