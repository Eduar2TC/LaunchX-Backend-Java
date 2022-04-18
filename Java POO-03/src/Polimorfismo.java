/*Outcasting : Creación de un objeto de la clase padre que hace referencia al objeto de la clase hija */
class Bike {
    void run(){
        System.out.println("Running");
    }
}

public class Polimorfismo extends Bike {
    //Redifinición

    @Override
    void run() {
        System.out.println("Metodo redefinido");
    }

    public static void main(String[] args) {
        Bike bike = new Polimorfismo(); //Out casting - ligadura dinámica
        bike.run();
    }
}
