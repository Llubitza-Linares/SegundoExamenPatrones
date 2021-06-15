package Observer;

public class Cliente {
    public static void main (String []args){

        Publicaciones publicaciones = new Publicaciones();

        Usuario usuario1 =new Usuario(new Persona("Teresa"), "Video");
        Usuario usuario2 =new Usuario(new Persona( "Romina"), "Imagen");
        Usuario usuario3 =new Usuario(new Persona("Emilia"), "Video");
        Usuario usuario4 =new Usuario(new Persona("Lara"), "Video");
        Usuario usuario5 =new Usuario(new Persona("Camila"), "Imagen");

        publicaciones.attach(usuario1);
        publicaciones.attach(usuario2);
        publicaciones.attach(usuario3);
        publicaciones.attach(usuario4);
        publicaciones.attach(usuario5);

        publicaciones.uploadNewNotificacion(new Notificaciones("Video", "El video de la pagina Se Feliz"));
    }
}
