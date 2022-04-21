public class Bicicleta extends Vehiculo implements AccionesGenericas{
    public Bicicleta() {
        super(2, "Paseo", "Azul");
    }

    @Override
    public void avanzar() {
        System.out.println("Pedaleando en " + this.getNumRuedas() );
    }

    @Override
    public void frenar() {
        System.out.println("Estoy deteniendome desde mi bicicleta");
    }

    @Override
    public void fallar() {
        System.out.println("La cadena de mi bicileta se rompio");
    }


}
