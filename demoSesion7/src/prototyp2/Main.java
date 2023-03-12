package prototyp2;



public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.modelo = "coupe";
        coche.marca = "Toyota";
        coche.puertas = 5;

        System.out.println( coche.marca + " " + coche.modelo + " " + coche.puertas);

        try {
            Coche clon  = coche.clonar();
            clon.puertas = 4;
            System.out.println(clon.marca + " " + clon.puertas + " " + clon.modelo);
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar : " + e.getMessage());
            
    }
    }
}
