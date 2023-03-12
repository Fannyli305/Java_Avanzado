package Prototype;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.modelo = "coupe";
        coche.marca = "Toyota";
        coche.puertas = 5;

        System.out.println( coche.marca + " " + coche.modelo + " " + coche.puertas);

        Coche clonado = coche.Clon();
        clonado.marca = "susuky";
        System.out.println(clonado.marca + " " + clonado.puertas + " " + clonado.modelo);
    }
}
