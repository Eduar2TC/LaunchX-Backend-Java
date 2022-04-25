//Super man, ironman
public class SuperHeroe extends Mona implements Poder{
    private String medio; //Medio de vuelo
    public SuperHeroe(String nombre, String rol, String medio) {
        super(nombre, rol);
        this.medio = medio;
    }

    public String getMedio() {
        return medio;
    }

    @Override
    String presentacion() {
        return "Hola soy " +this.getRol() +  "pulpo, me llamo " + this.getNombre();
    }

    @Override
    public void volar() {
        System.out.println(" y vuelo gracias a mi " + this.getMedio());
    }
}
