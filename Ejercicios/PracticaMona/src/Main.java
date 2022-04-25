import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        ArrayList<ArrayList> arrayLists = new ArrayList<ArrayList>();
        ArrayList<Empleo> empleos = new ArrayList<Empleo>();
        ArrayList<SuperHeroe> superHeroes = new ArrayList<SuperHeroe>();
        ArrayList<VideoJuego> videoJuegos = new ArrayList<VideoJuego>();

        empleos.add(
                new Empleo("Luchadortocat", "Luchador", "Lucha con El santo")
        );
        empleos.add(
                new Empleo("Codercat", "Programador", "Programa en HTML XD")
        );
        superHeroes.add(
                new SuperHeroe("IronCat", "Play boy, Ironman", "Por el traje metalico")
        );
        superHeroes.add(
                new SuperHeroe(" Okal-Eltocat", "Super man", "Por la capa XD")
        );
        videoJuegos.add(
                new VideoJuego("Megacat", "Megaman", "Arcade")
        );
        videoJuegos.add(
                new VideoJuego(" Plumber", "Mario Bros", "Arcade... ETC.")
        );
        arrayLists.add(empleos);
        arrayLists.add(superHeroes);
        arrayLists.add(videoJuegos);

        System.out.println(
                "Empleo : " + ((Empleo) arrayLists.get(0).get(0)).getNombre() + " " +
                        ((Empleo) arrayLists.get(0).get(0)).presentacion()
        );
        System.out.println(
                "Empleo : " + ((Empleo) arrayLists.get(0).get(1)).getNombre() + " " +
                        ((Empleo) arrayLists.get(0).get(1)).presentacion()
        );
        System.out.println(
                "Super Heroe : " + ((SuperHeroe) arrayLists.get(1).get(0)).getNombre() + " " +
                        ((SuperHeroe) arrayLists.get(1).get(0)).presentacion()
        );
        System.out.println(
                "Super Heroe : " + ((SuperHeroe) arrayLists.get(1).get(1)).getNombre() + " " +
                        ((SuperHeroe) arrayLists.get(1).get(1)).presentacion()
        );
        System.out.println(
                "Video juegos : " + ((VideoJuego) arrayLists.get(2).get(0)).getNombre() + " " +
                        ((VideoJuego) arrayLists.get(2).get(0)).presentacion()
        );
        System.out.println(
                "Video juegos : " + ((VideoJuego) arrayLists.get(2).get(1)).getNombre() + " " +
                        ((VideoJuego) arrayLists.get(2).get(1)).presentacion()
        );
    }
}
