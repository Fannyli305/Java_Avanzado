import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        nombres.stream().forEach(x -> System.out.println(x));

        Stream<String> valores = nombres.stream().
                map(x -> x.toUpperCase())
                        .filter(x -> x.startsWith("P"));
        valores.forEach(x -> System.out.println(x));
        //forma funcional
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(numeros);
        var rsNumero = stNumeros
                .map(f -> f * 2)
                .filter(f -> f % 2 == 0)
                .reduce( 0,(z,y)->{
            System.out.println("z  es " + z + " y es  " + y );
            return z+y;
        });

        // forma imperativa
        int sumatotal = 0;
        for ( int numero : numeros){
            numero = numero * 2;
            if (numero % 2 != 0){
                continue;
            }
            sumatotal += numero;
        }
        System.out.println("mi suma de pares es : " + rsNumero + " con for : " + sumatotal);


    }
}