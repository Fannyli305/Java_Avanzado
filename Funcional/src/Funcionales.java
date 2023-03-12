import java.util.stream.IntStream;

public class Funcionales {

    public static void main(String[] args) {
        System.out.println(suma(5));
        System.out.println(sumaRecursiva(5));
        headRecursion(5);
        toilRecursion(5);
        System.out.println(sumaFuncional(5));
        System.out.println(factorial(5));//iterativa
        System.out.println(factorialFuncional(5));
        System.out.println(factorialRecursivo(5));

        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++){
            sumaRecursiva(100);
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Ms en total : " + (tiempoFinal - tiempoInicial));
    }

    public static void toilRecursion(int valor){
        if (valor == 0){
            return;
        }
        System.out.println(valor);
        toilRecursion(valor -  1);
    }
    public static int suma (int max){
        int resultado = 0;
        for(int i = 0; i <= max; i++){
            resultado = resultado + i;
        }
         return resultado;
    }

    public static int sumaRecursiva(int numero){
        if(numero == 1){
            return 1;
        }
        return numero + sumaRecursiva(numero - 1);
    }

    public static void headRecursion (int valor){
        if (valor == 0){
            return;
        }
        headRecursion (valor - 1);
        System.out.println(valor);
    }
    public static int sumaFuncional(int numero){
        //5+4+3+2+1
        return IntStream.rangeClosed(1,5)
                .reduce(0,(a,b)->a+b);

    }

    public static int factorial(int numero){
        int resultado = 1;
        for(int i = 1; i <= numero ; i++){
            resultado = resultado * i;
        }
        return  resultado;
    }
    public static int factorialRecursivo(int numero){
        if(numero == 0){
            return  1;
        }
        return numero * factorialRecursivo((numero - 1));
    }
    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1,(a,b)-> a * b);
    }


}
