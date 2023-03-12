package Refactor2;

public class Main {

    public static void main(String[] args) {
        ConstructorLargo consLargo = new ConstructorLargo("Toyota", "2001T", "cuatrobandas", 4);

        //con esta forma es mas facil recordar la informacion del la clase
        ConstructorLargoBuilder consLargoB = new ConstructorLargoBuilder("kawasaki").
                conModelo("Kawasaki 2002").conMotor("estatico").conPuertas(0);

        System.out.println(consLargo);
        System.out.println(consLargoB);
    }
}
