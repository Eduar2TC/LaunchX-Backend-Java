public abstract class Vehiculo {
    private int numRuedas;
    private String tipo;
    private String color;
    public Vehiculo( int numRuedas, String tipo, String color ){
        this.numRuedas = numRuedas;
        this.tipo = tipo;
        this.color = color;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void verCaracteristicasVehiculo(){
        System.out.println("ruedas: " + this.numRuedas + "\n" +
                            "tipo: " + this.tipo + "\n" +
                            "color: " + this.color + "\n"
        );
    }
    public abstract void avanzar();
}
