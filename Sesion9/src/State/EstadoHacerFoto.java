package State;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "camara se encuentra abierta";
    }

    @Override
    public String hacerFoto() {
        System.out.println("foto tomada con exito");

        return "vuelve ha su estado bloqueado";
    }
}
