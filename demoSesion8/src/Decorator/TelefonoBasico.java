package Decorator;

public class TelefonoBasico implements  Telefono{
    @Override
    public void crear() {
        System.out.println("soy un telefono basico, tengo pocas caracteristicas ");
        tengoGSM();
        tengoSMS();
    }

    private  void tengoGSM(){
        System.out.println("  -> Tel basico: tengo GSM");
    }
    private void tengoSMS(){
        System.out.println("  -> Tel basico: tengo SMS");
    }
}
