package State;

public class EstadoBloqueado extends Estado{
    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "la camara esta bloqueada";
    }

    @Override
    public String hacerFoto() {
        return "desbloquea la camara para tomar foto";
    }
}
