package Prototype;

public class Coche {

    public String marca;
    public String modelo;
    public int puertas;

    public Coche() {
    }
    public  Coche Clon(){
        Coche clon = new Coche();
        clon.marca = marca;
        clon.puertas = puertas;
        clon.modelo = modelo;

        return clon;
    }

}
