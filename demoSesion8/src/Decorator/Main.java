package Decorator;

public class Main {
    public static void main(String[] args) {
        /*TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();*/

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        TelefonoNextGen tn = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );
        tn.crear();
    }
}
