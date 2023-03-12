package Builder;

public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new CocheBuilder("Daego")
                .setPuertas(5)
                .setMotor("electrico")
                .setTipo("automatico")
                .build();

        /*StringBuilder cadena = new StringBuilder("hola ");
        cadena.append("amigos ").append("estan bien");

        System.out.println(cadena);*/

        System.out.println(" puertas: " + coche.getPuertas());
        System.out.println(" motor: " + coche.getMotor());
        System.out.println(" Tipo: " + coche.getTipo());

    }
}
