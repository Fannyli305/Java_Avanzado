package Observer;

public class Main {

    public static void main(String[] args) {
        Emisora emisora = new Emisora();


        ReceptorTv tv = new ReceptorTv();
        ReceptorRadio radio = new ReceptorRadio();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);

        emisora.emite();
    }
}
