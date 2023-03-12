package State;

import State.Telefono;

public class Main {
    public static void main(String[] args) {

        Telefono phone = new Telefono();
        System.out.println(phone.estado.hacerFoto());
        System.out.println(phone.estado.desbloquear());
        System.out.println(phone.estado.abrirCamara());
        System.out.println(phone.estado.hacerFoto());
        System.out.println(phone.estado.hacerFoto());
    }
}
