public abstract class Mona {
    private String nombre;
    private String rol;

    public Mona( String nombre, String rol ){
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    abstract String presentacion();
}
