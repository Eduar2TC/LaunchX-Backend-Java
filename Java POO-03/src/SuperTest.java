/*Caso 1: Redifinición de variabke de instancia*/
/*Caso 3: invocación del constructo de la clase inmediata*/
class Animal {
    //Caso 3
    public Animal(){
        System.out.println("Nace un animal");
    }
    //Caso 1
    String color = "Negro";
    //Caso 2
    public void comer(){
        System.out.println("Soy un animal y como lo que sea ");
    }
}

class Gato extends Animal {
    //Caso 3
    public Gato(){
        super();
        System.out.println("Há nacido un gato garka");
    }
    //Caso 1
    String color = "café";
    public void printColor(){
        System.out.println("Color del gato: " + this.color);
        System.out.println("Color del papa animal: " + super.color);
    }
    //Caso 2
    public void comer(){
        System.out.println("Estoy comiendo ratas");
    }
    public void dormir(){
        System.out.println("Soy un gato dormilon");
    }
    public void all(){
        super.comer();
        this.dormir();
    }

}

public class SuperTest {
    public static void main(String[] args) {
        //Caso 1
        new Gato().printColor();
        //Caso 2
        new Gato().all();
        //Caso 3
        new Gato();
    }
}
