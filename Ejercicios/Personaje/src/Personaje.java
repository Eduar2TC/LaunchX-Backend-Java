public class Personaje {
    private String nombre;
    private String genero;
    private String casa;
    private String boggart;
    private String patronus;

    public Personaje( String nombre, String genero, String casa, String boggart, String patronus){
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public String getCasa() {
        return  this.casa;
    }
    public String getBoggart() {
        return this.boggart;
    }
    public String getPatronus() {
        return this.patronus;
    }
    public void setCasa( String casa ){
        if( casa == "Gryffindor" || casa == "Hufflepuff" || casa == "Ravenclaw" || casa == "Slytherin" ){
            if( this.casa != casa ){
                this.casa = casa;
            }else{
             this.casa = this.casa;   
            }
        }
    }

}
