package Adapter;

public class Lampara implements Enchufable {
    boolean encendido = false;
    @Override
    public void enciende() {
        encendido = true;

        System.out.println("lampara encendido");
    }

    @Override
    public void apaga() {
        encendido = false;

        System.out.println(" lampara apagado");
    }

    @Override
    public boolean estaEncendido() {
        return false;
    }
}
