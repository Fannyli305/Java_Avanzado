package Refactoryn;

public class Main {

    public static void main(String[] args) {
        idProducto();
        producto2(2);
    }

    //CODIGO SIN REFACTORIZACION
    public static boolean idProducto(){
        boolean isProducto = productoNumero(2);
        if (isProducto){
            System.out.println(isProducto);
        }

        return isProducto;
    }
    public static boolean productoNumero(int numero){
        if (numero == 2){
            return true;
        }
        return false;
    }

    // CODIGO REFACTORIZADO
    public static boolean producto2(int numero){
        boolean isProducto2 =(numero == 2 ? true : false);
        if (isProducto2){
            System.out.println(isProducto2);
        }

        return isProducto2;
    }

}
