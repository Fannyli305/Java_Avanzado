package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero  implements Usuarios{

    private String FicheroUsuario = "usuarios.txt";
    private PrintStream fichero;
    public  UsuariosFichero(){
        try{
            fichero = new PrintStream(FicheroUsuario);
        }catch (Exception e){
            System.out.println("No se puede abrir " + e.getMessage());
        }
    }
    @Override
    public void crear(String nombre){
        fichero.println(nombre);
    }
    @Override
    public ArrayList<String> listar(){
        ArrayList<String> usuarios = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(FicheroUsuario));

            while (scanner.hasNext()){
                usuarios.add(scanner.next());
            }
            scanner.close();
        }catch (Exception ex){
            System.out.println("No lee fichero " + ex.getMessage());
        }
        return usuarios;
    }
}
