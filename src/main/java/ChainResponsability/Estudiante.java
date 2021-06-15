package ChainResponsability;

public class Estudiante extends ChatEducativo {
    private String nombre;
    private int numeroMatricula;

    public Estudiante(String nombre, int numeroMatricula, IChat iChat) {
        super(iChat);
        this.nombre = nombre;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void mensajeATodos(String mensaje) {
        this.enviar(new Mensaje(true, true, true, mensaje));
    }

    public void mensajeADocentes(String mensaje) {
        this.enviar(new Mensaje(false, true, false, mensaje));
    }

    public void mensajeAAdministrativos(String mensaje) {
        this.enviar(new Mensaje(false, false, true, mensaje));
    }

    @Override
    protected void enviar(Mensaje mensaje) {
        iChat.send(mensaje, this);

    }

    @Override
    protected void recibir(String message) {
        System.out.println("El estudiante:");
        System.out.println(nombre+" ha recibido el mensaje:");
        System.out.println(message);
    }

}