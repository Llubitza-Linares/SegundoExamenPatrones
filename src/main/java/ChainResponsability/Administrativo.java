package ChainResponsability;

public class Administrativo extends ChatEducativo {
    private String cargo;
    private String nombre;

    public Administrativo(String cargo, String nombre, IChat iChat) {
        super(iChat);
        this.cargo = cargo;
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mensajeATodos(String mensaje) {
        this.enviar(new Mensaje(true, true, true, mensaje));
    }

    @Override
    protected void enviar(Mensaje mensaje) {
        iChat.send(mensaje, this);

    }

    @Override
    protected void recibir(String message) {
        System.out.println("El administrativo:");
        System.out.println(nombre + " ha recibido el mensaje:");
        System.out.println(message);
    }

}