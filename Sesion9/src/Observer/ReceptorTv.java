package Observer;

public class ReceptorTv implements Receptor{
    @Override
    public void recibe() {
        System.out.println("señal recibida Television");
    }
}
