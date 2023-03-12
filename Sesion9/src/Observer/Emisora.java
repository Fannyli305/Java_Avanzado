package Observer;

import java.util.ArrayList;

public class Emisora {
    private ArrayList<Receptor> receptors = new ArrayList<>();

    public void  meteReceptor(Receptor receptor){
        this.receptors.add(receptor);
    }

    public void emite() {
        for(Receptor receptor : receptors){
            receptor.recibe();
        }
    }
}
