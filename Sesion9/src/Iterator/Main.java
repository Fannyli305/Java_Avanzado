package Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.Crear(new Usuario("fanny", 43));
        usuarios.Crear(new Usuario("jeison", 25));
        usuarios.Crear(new Usuario("Lucero", 21));
        usuarios.Crear(new Usuario("Karol",14 ));
        usuarios.Crear(new Usuario("Milan", 5));


        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println(" usuario es " + usuario.getNombre());
        }
        usuarios.Crear(new Usuario("Graciela", 65));
        Usuario usuario = usuarios.siguiente();
        System.out.println(" usuario es " + usuario.getNombre());

        // para volver a recorrer la lista se reinicia a cero
        usuarios.reinicia();
        while (usuarios.hayMas()){
            usuario  = usuarios.siguiente();
            System.out.println(" usuario es " + usuario.getNombre());
        }


    }
}
