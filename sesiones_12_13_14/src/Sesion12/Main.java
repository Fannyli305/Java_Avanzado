package Sesion12;

import javax.swing.*;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

    }
}
/* las clases suelen llamarse por nombre sustantivo y
tiene que revelar su cometido e inician por mayuscula y
si tienen mas de dos palabras se capitalizan
 */

class ReveseString{}
class UserManager{}

/*
las interfaces tienen tambien un mombrado correcto utilizar abjetivos
e indicar que hacen , en castellano suelen finalizar en ador
 */
interface  Iterable{}
interface Serializable{}
interface  Iterador{}
interface Serializador{ }

/*
Los metodos cambian a la hora de como los debemos declarar todos van a
comenzar con una letra en minuscula y tienen que tener un verbo y tienen
que decir claramente para lo que sirven
 */

class EjemploMetodos{
    public void createUser(){}
}
/*
las constantes tienen un valor que no va ha cambiar
se pueden usar neumotecnicos
 */
class EjemploConstantes{
    public static final int MAX_USERS = 15;
}
/*
una propiedad es una variable dentro de una clase, una variable local
a esa clase
 */

class EjemploPropiedad{
    private int contador = 0;
}

/*
las nombres de las variable tienen que ser autodescriptivos indicar que
va ha llevar la variable y si llevan dos o mas palabras se capitalizan
 */

class EjemplosVariables{
    int []pares = {2,4,6,8};

    String tenp = "hola"; // en caos se utilizaran variables temporalews
    String tmp = "Hola";  // siempre que sea justificado no se utilizan de forma generañ
}

/*
dentro del bucle for si esta permitido utilizar letras que estan de forma
estandar de nombrar variables
 */
class EjercicioBucleFor{

    public void crarFor() {
        int[][] numeros = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
            };

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
        }
        // y si es un array bidimensional se utiliza tambien una letra que
            // esta de forma estandar
         }
    }
}
/*
Anotacion hungara  consiste en interponer una, dos o tres letras al nombre
de una variable y que posteriormente ayudan a identificarlas solo con verla
aunque no sepamos el tipo de datos
 */
class EjercicioAnotacionHungara{

    public void crearAnotacioHungara() {
        int[] aNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};//array se antepone a
        boolean bEsDeDia = false; // booleano b
        char cLetra = 'a'; // char c
        double dValor = 5.1d; // double d
        Hashtable<String, Integer> hUsuarios = new Hashtable(); // Hashtable h
        int iValores = 5; // enteros i
        long iValoresLong = 5; // i tambien puede ser un long
        /*
        la letra o para objetos UserManager oUserManager = new UserManager();

         */
        String sCadena = "hola mundo"; // para cadenas se utiliza la s
        var vVariable = 5; // var v
        byte yByte = 1; // byte y
        float flFloat = 1.3f; // float fl

        JButton btnBotonAceptar;
        JButton btnBotonCancelar;
        JLabel lblLabel;

        int[]aiNumermos = {1,2,3,5,6,7}; // array de enteros ai array flotantes af

    }

}




