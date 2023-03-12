package Refactor3;

public class Main {

    public static void main(String[] args) {
        System.out.println(OpenJDKJavEnWindos11());
        System.out.println(esOracleJavaenMacOs());
        System.out.println(System.getProperty("java.runtime.name"));
        System.out.println(System.getProperty("os.version"));
    }

    public static boolean OpenJDKJavEnWindos11(){
        if(System.getProperty("java.runtime.name").contains("OpenJDK")
        && System.getProperty("os.version").compareTo("10.0") == 0){
            System.out.println("Es OpenJDK en windos 11");
            return true;
        }
        return false;
    }

    //extrayendo variables
    public static boolean esOracleJavaenMacOs(){
        boolean runtimeOracle = System.getProperty("java.runtime.name").contains("Oracle");
        boolean osVersion = System.getProperty("os.version").compareTo("11.6") == 0;

        if (runtimeOracle && osVersion){
            System.out.println("Es Oracle en MacOs 11.6");
            return true;
        }
        return false;

    }
}

