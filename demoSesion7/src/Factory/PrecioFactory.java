package Factory;

/*
PATRON FACTORY SIRVE PARA CREAR UNA GERARQUIA DE CLASES
Y PODER UTILIZARLAS UNA U OTRA DE FORMA TRANSPARARENTE
*/

public class PrecioFactory {
    Precio precio;
    private PrecioFactory(){};

    public PrecioFactory(String pais){
        if(pais.equalsIgnoreCase("España")){
            System.out.println("España precio en EUR");
            precio = new PrecioEUR();
    }else if (pais.equalsIgnoreCase("UK")){
            System.out.println("estamos en UK");
            precio = new PrecioCEP();
        }else{
            System.out.println("otro pais precio en USD");
            precio = new PrecioUSD();
        }

    }
    public double getPrecio(){
        return  precio.getPrecio();
    }
}
