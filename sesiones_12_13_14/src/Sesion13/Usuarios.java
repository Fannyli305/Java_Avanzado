package Sesion13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuarios {

    private ArrayList<Usuario> usuarios = new ArrayList();

    public void añadirUsuario(Usuario usuario) throws UserException{
        if(usuarios.contains(usuario)){
            throw new UserRegisteredException(usuario.nombre);
        }
        usuarios.add(usuario);
    }
}
