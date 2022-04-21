public class Coche extends Vehiculo{
    public Coche(){
        super( 4, "Camion", "Verde" );
    }
    @Override
    public void avanzar() {
        System.out.println("Avanzando en  " + this.getNumRuedas() + " ruedas" );
    }
}