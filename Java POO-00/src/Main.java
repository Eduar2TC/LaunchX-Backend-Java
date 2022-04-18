import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        def( bicicleta );
        show(bicicleta);
    }
    public static void def(Bicicleta bicicleta){
        if( bicicleta != null ){
            bicicleta.setColor("azul");
            bicicleta.setPines(6);
            bicicleta.setRodada(26);
            bicicleta.setVelocidad(10.5);
        }else {
            System.out.println("Objeto nulo");
        }
    }
    public static void show(Bicicleta bicicleta){
        String msg = "Caracteristicas : \nColor: ";
        if (bicicleta != null){
            msg += bicicleta.getColor() + "\nRodada: ";
            msg += bicicleta.getRodada() + "\nPins: ";
            msg += bicicleta.getPins() + "\nVelocidad: ";
            msg += bicicleta.getVelocidad()+ "\n";
            System.out.println(msg);
        }else
            System.out.println("No hay bicicleta");
    }
}
