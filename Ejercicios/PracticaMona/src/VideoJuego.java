//Mario...
public class VideoJuego extends Mona{
    private String tipo; //Arcade, Plataforma ...
    public VideoJuego(String nombre, String rol, String tipo) {
        super(nombre, rol);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    String presentacion() {
        return  "Hola soy " + this.getNombre() + "soy " + this.getRol() + " y pertenezco a genero de " + this.getTipo();
    }
}
