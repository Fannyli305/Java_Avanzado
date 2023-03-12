package Adapter;

public class Horno implements  Enchufable{
    boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("horno encendida");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("horno apagada");
    }

    @Override
    public boolean estaEncendido() {
        return false;
    }
}
