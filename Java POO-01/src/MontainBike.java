public class MontainBike {
    public static void show(){
        Bike blueBike= new Bike("azul", 6 );
        System.out.println(blueBike.getColor());
        System.out.println(blueBike.getVelocity());
    }

    public static void main(String[] args) {
        show();
    }

}
