public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Bicicleta();
        vehiculo.verCaracteristicasVehiculo();
        vehiculo.avanzar();
        System.out.println("Camion");
        Coche coche = new Coche();
        coche.verCaracteristicasVehiculo();
        coche.avanzar();
    }
}
