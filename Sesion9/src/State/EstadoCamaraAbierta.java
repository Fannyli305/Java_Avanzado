package State;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "camara lista para la foto";
    }

    @Override
    public String hacerFoto() {
        this.telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "contando para tomar foto";
    }
}
