/*Pruebas*/

class Animal2 {
    public void comer(){
        System.out.println("Animal comiendo");
    }
}
class Perro extends Animal {
    public void comer(){
        System.out.println("Perro comiendo");
    }
}
class Cachorro extends Animal{
    //Aplicación del Polimorfismo - redifiniendo el comportamiento
    public void comer(){
        System.out.println("Cachorrro Amamantandose...");
    }
}

public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.comer();
        animal = new Perro();
        animal.comer();
        animal = new Cachorro();
        animal.comer();
    }
}
