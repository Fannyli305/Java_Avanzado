package Iterator;

import java.util.ArrayList;

public class Usuarios implements  UsuarioIterator{

        // SE PUEDE UTILIZAR tambienLinkedList y los metodos siguen igual

    private ArrayList<Usuario> usuarios = new ArrayList();
    private int posicion = 0;
    public void Crear(Usuario usuario ){
        usuarios.add(usuario);
    }
    @Override
    public boolean hayMas() {
        return posicion < usuarios.size();
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = usuarios.get(posicion);
        posicion += 1;
        return usuario;
    }
}
