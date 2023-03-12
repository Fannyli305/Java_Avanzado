package Refactor;

public class Main {
    public static void main(String[] args) {
        int []numeros = {12, 23, 45, 1, 9};
        imprimirMayorYMenor(numeros);
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
}
