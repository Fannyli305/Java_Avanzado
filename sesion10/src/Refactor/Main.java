package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []numeros = {12, 23, 45, 1, 9};
        int []numers = {12, -23,- 45, 1, 9};
        int []numbers = {12, 23, -45, 1, 9};
        imprimirMayorYMenor(numeros);
        imprimirMenoryMayor(numbers);
        imprimirMayorMenor(numers);
        funcionImprimirMayorYMenor(numeros);

    }

    public  static void imprimirMayorYMenor(int []numeros){
        int mayor = 0;
        int menor = numeros[0];
        for (int i = 0; i<numeros.length;i++){
            if(mayor < numeros[i]){
                mayor = numeros[i];
            }
            if(menor > numeros[i]){
                menor = numeros[i];
            }
        }
        System.out.println("mayor: " + mayor + " y menor : " + menor);
    }


    // forma corta de un if
    public static void imprimirMenoryMayor(int []numbers){
        int mayor = 0;
        int menor = numbers[0];
        for (int i = 0; i<numbers.length;i++){
            mayor = mayor < numbers[i] ? numbers[i] : mayor;
            menor = menor > numbers[i] ? numbers[i] : menor;
        }
        System.out.println("menor : " + menor + " y mayor : " + mayor);
    }
    // mas reducido el codigo
    public static void imprimirMayorMenor(int  []numers){
        int mayor = 0;
        int menor = numers[0];
        for(int i : numers){
            mayor = mayor < i ? i:mayor;
            menor = menor >i  ? i:menor;

        }
        System.out.println("mayor: " + mayor + " y menor : " + menor);
    }

    // para reducir el codigo programacion funcional
    public static void funcionImprimirMayorYMenor(int []numeros){
        int mayor = Arrays.stream(numeros).reduce(0, (a , b) -> a > b ? a: b);
        int menor = Arrays.stream(numeros).reduce(0, (a , b) -> a < b ? a: b);
        System.out.println("menor : " + menor + " y mayor : " + mayor);
    }

}
