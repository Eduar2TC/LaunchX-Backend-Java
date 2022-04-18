import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
/*Herencia simple : Empleado --> Programador*/
/*Herencia multinivel : Empleado -> Programador -> ProgramadorWeb*/
/*Herencia gerarquica Empleado -> Programador, Empleado -> EmpleadoWeb */

public class Empleado1 {
    double salario = 40000;
}
class Programador extends Empleado1{
    int bono = 1000;
    public void main(){
        Programador programador = new Programador();
        System.out.println("Salario del programador :" + programador.salario );
        System.out.println("El bono del programador es: " + programador.bono);
    }
    public void mensaje(){
        System.out.println("Soy Programador");
        main();
    }
}
class ProgramadorWeb extends Programador {
    public static void main(String[] args) {
        ProgramadorWeb programadorWeb = new ProgramadorWeb();
    }
}

