package Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("he recibido un mensaje soy colega concreto dos");
    }

    @Override
    void envia() {
        System.out.println("soy colega concreto 2 he enviado un mensaje");
        mediator.reenvia(this);
    }
}
