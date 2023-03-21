package Sesion13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuarios {

    private ArrayList<Usuario> usuarios = new ArrayList();

    public void añadirUsuarios(Usuario ...usuarios) throws UserException {
        for (Usuario usuario : usuarios) {
            if (this.usuarios.contains(usuario)) {
                throw new UserRegisteredException(usuario.nombre);
            }
            this.usuarios.add(usuario);
        }
    }
}
