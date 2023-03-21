package Sesion13;

import java.util.Arrays;

public class Main {
    /*
    las funciones son una agrupacion de codigo que debe realizar una tarea
    concreta y las funciones tienen un objetivo primordial que es la reutilizacion
    de codigo
     */

    public static void main(String[] args) {
        boolean bEsLaborable = esLaborable(5);

        determinarFruta();

        int []iNumeros = {1,2,3,4,5,6};
        int resultado = sumarNumeros(iNumeros);

        System.out.println(sumarInfinitamente(1,2,3));
        System.out.println(sumarInfinitamente(1,2,3,4,5,6,7));
        System.out.println(sumarInfinitamente(1,2,3,4,5,6,7,8,9));

        Usuario usuario = new Usuario();
        usuario.nombre = "pepe ";
        usuario.apellido = " botello";

        Usuario usuario2 = new Usuario();
        usuario.nombre = "paco ";
        usuario.apellido = "pedraza";

        Usuarios usuarios = new Usuarios();
        try {
            usuarios.añadirUsuarios(usuario);
            usuarios.añadirUsuarios(usuario2);
            usuarios.añadirUsuarios(usuario2);
        }catch (UserException e){
            System.out.println("Error al añadir objeto de usuario : " + e.getMessage());
        }

    }
    public static boolean esLaborable(int dia){
        return (dia > 0 && dia < 6 );
    }
    // Cuando utilizar switch
    public static  void  determinarFruta(){
        String sFruta = "Manzana";

        switch (sFruta){
            case "pera":
                System.out.println("es una pera");
                break;
            case "Melocoton":
                System.out.println("es un Melocoton");
                break;
            case "Banana":
                System.out.println("es un Banana");
                break;
            case "Manzana":
                System.out.println("es un Manzana");
                break;
            default:
                System.out.println("Es otra cosa");
                break;
        }

    }

    /*
    Funcion monatica es una funcion que recibe un solo parametro de entrada
     */
    public static int sumarNumeros(int []numeros){
        return Arrays.stream(numeros).reduce(0, (a, b) -> a + b);

    }
    // funciones con dos argumentos son funciones diadicas
    public static int sumarValores(int valorA, int valorB){
        return valorA+valorB;
    }
    //funciones con tres argumentos funcion triada o triadica
    public static int sumarTresValores(int valorA, int valorB, int valorC){
        return valorA + valorB + valorC;
    }
    // funciones con cuatro o mas argumentos son funciones polidalicas
    public static int sumarCuatroValores(int valorA, int valorB, int valorC, int valorD){
        return valorA + valorB + valorC + valorD;
    }
    /* hay otra forma de hacer funciones polidalicas utilizando argumentos
    variables
     */
    public static int sumarInfinitamente (int ...numeros){
        int resultado = 0;
        for(int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }
}
