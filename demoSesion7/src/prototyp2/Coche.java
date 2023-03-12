package prototyp2;

public class Coche implements  Cloneable{
    public String marca;
    public String modelo;
    public int puertas;

    public Coche() {
    }

    public Coche clonar() throws CloneNotSupportedException {
        return (Coche) this.clone();
    }

}
