package RefactorInLine;

public class Main {

    public static void main(String[] args) {
        hoyESDomingo();
        hoyESDomingo1(7);


    }
    public static boolean hoyESDomingo(){
        boolean isDomingo = hoyEsDiaNumero(7);
        if (isDomingo){
            System.out.println(isDomingo);
        }

        return isDomingo;
    }
    public static boolean hoyEsDiaNumero(int numero){
        if (numero == 7){
            return true;
        }
        return false;
    }

    // la forma inline reduce el codigo
    public static boolean hoyESDomingo1(int numero){
        boolean isDomingo1 =(numero == 7 ? true : false);
        if (isDomingo1){
            System.out.println(isDomingo1);
        }

        return isDomingo1;
    }

}
