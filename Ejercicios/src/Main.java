import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personaje> personaje = new ArrayList<Personaje>();
        personaje.add(
                new Personaje(
                        "Harry Potter",
                        "M",
                        "Gryffindor",
                        "Dementor",
                        "Ciervo"
                )
        );
        personaje.add(
                new Personaje(
                        "Albus Dumbledore",
                        "M",
                        "Gryffindor",
                        "Su hermana muerta",
                        "Fenix"
                )
        );
        personaje.add(
                new Personaje(
                        "Voldemort",
                        "M",
                        "Slytherin",
                        "Su cuerpo muerto",
                        "No disponible"
                )
        );
        personaje.add(
                new Personaje(
                        "Hermione Granger",
                        "F",
                        "Gryffindor",
                        "profesora McGonagall",
                        "Nutria"
                )
        );
        personaje.add(
                new Personaje(
                        "Ron Weasley",
                        "M",
                        "Gryffindor",
                        "Acromántula",
                        "Jack Russell Terrier"
                )
        );
        for ( Personaje i  : personaje ){
            System.out.println("Nombre: " + i.getNombre() + " Genero: " + i.getGenero() + " Casa: " + i.getCasa() + " Boggart: "+ i.getBoggart() + " Patronus: "+ i.getPatronus() );
        }
    }
}
