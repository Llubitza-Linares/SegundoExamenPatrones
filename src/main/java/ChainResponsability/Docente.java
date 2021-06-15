package ChainResponsability;

public class Docente extends ChatEducativo {
    private int ci;
    private String nombre;

    public Docente(int ci, String nombre, IChat iChat) {
        super(iChat);
        this.ci = ci;
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mensajeADocentes(String mensaje) {
        this.enviar(new Mensaje(false, true, false, mensaje));
    }

    public void mensajeAEstudiantes(String mensaje) {
        this.enviar(new Mensaje(true, false, false, mensaje));
    }

    @Override
    protected void enviar(Mensaje mensaje) {
        iChat.send(mensaje, this);

    }

    @Override
    protected void recibir(String message) {
        System.out.println("El docente:");
        System.out.println(nombre + " ha recibido el mensaje:");
        System.out.println(message);
    }
}