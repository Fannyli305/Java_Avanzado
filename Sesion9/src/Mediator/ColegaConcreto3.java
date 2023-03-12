package Mediator;

public class ColegaConcreto3 extends Colega{
    @Override
    void recibe() {
        System.out.println("he recibido un mensaje soy colega concreto 3");
    }

    @Override
    void envia() {
        System.out.println("soy colega concreto 3 he enviado un mensaje");
        mediator.reenvia(this);
    }
}
