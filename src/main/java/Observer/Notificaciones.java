package Observer;

public class Notificaciones {
    private String tipoDeNotificacion;
    private String contenido;

    public Notificaciones(String tipoDeNotificacion, String contenido) {
        this.tipoDeNotificacion=tipoDeNotificacion;
        this.contenido=contenido;
    }

    public void info(){
        System.out.println("Tipo de archivo: ["+tipoDeNotificacion+"]");
        System.out.println("Contenido: " + contenido);
    }

    public String getCategoria() {
        return tipoDeNotificacion;
    }

    public void setCategoria(String categoria) {
        this.tipoDeNotificacion = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
