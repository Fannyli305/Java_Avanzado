package Mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("he recibido un mesnsaje soy colega concreto 1");
    }

    @Override
    void envia() {
        System.out.println("soy colega concreto 1 envio un mensaje");
        mediator.reenvia(this);
    }
}
