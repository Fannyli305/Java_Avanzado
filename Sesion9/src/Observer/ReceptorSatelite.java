package Observer;

public class ReceptorSatelite implements Receptor{

    @Override
    public void recibe() {
        System.out.println("señal recibida en satelite");
    }
}
