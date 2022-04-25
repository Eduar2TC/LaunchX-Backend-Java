//Heisemberg, developer
public class Empleo extends Mona{
    private String descripcion;
    public Empleo(String nombre, String rol, String descripcion) {
        super(nombre, rol);
        this.descripcion = descripcion;
    }

    @Override
    String presentacion() {
        return "Hola mi nombre es : " + this.getNombre() + " y mi rol es " + this.getRol() ;
    }
}
