package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuariosMemoria usuarios = new UsuariosMemoria();
        crear(usuarios,"Uno");
        crear(usuarios,"Dos");
        crear(usuarios,"Tres");
        for (String usuario : listar(usuarios)){
            System.out.println(usuario);
        }

        UsuariosFichero usu = new UsuariosFichero();
        crear(usuarios,"One");
        crear(usuarios,"Two");
        crear(usuarios,"Tree");
        for (String usua : listar(usuarios)){
            System.out.println(usua);
        }

    }


    public static void crear(Usuarios usurario, String nombre) {
        usurario.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}

