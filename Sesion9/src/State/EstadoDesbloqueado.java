package State;

public class EstadoDesbloqueado extends Estado{
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "el movil esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        this.telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "la camara abierta puedes hacer foto";
    }

    @Override
    public String hacerFoto() {
        return "desbloquear la camara";
    }
}
