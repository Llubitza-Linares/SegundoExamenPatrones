package Observer;

public class Usuario implements IUsuario{
    private String tipoDePublicacion;
    private Persona persona;

    public Usuarios(Persona persona, String tipoDePublicacion) {
        this.persona=persona;
        this.tipoDePublicacion=tipoDePublicacion;
    }

    @Override
    public void update(String message, Notificaciones notificaciones) {
        System.out.println("*****************Notificacion");
        System.out.println(message);
        persona.info();
        notificaciones.info();
    }

    @Override
    public String getCategoria() {
        return this.tipoDePublicacion;
    }
}