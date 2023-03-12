package Adapter;

public class PowerAdapter  implements  Enchufable{

    public Ligtbulb ligtbulb = new Ligtbulb();
    @Override
    public void enciende() {
        ligtbulb.turnOn(110);
    }

    @Override
    public void apaga() {
        ligtbulb.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return false;
    }
}
