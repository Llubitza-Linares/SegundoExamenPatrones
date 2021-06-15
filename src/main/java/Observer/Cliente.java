package Observer;

public class Cliente {
    public static void main (String []args){

        Publicaciones publicaciones = new Publicaciones();

        Usuarios usuario1 =new Usuarios(new Persona("Teresa"), "Video");
        Usuarios usuario2 =new Usuarios(new Persona( "Romina"), "Imagen");
        Usuarios usuario3 =new Usuarios(new Persona("Emilia"), "Video");
        Usuarios usuario4 =new Usuarios(new Persona("Lara"), "Video");
        Usuarios usuario5 =new Usuarios(new Persona("Camila"), "Imagen");

        publicaciones.attach(usuario1);
        publicaciones.attach(usuario2);
        publicaciones.attach(usuario3);
        publicaciones.attach(usuario4);
        publicaciones.attach(usuario5);

        publicaciones.uploadNewNotificacion(new Notificaciones("Video", "El video de la pagina Se Feliz"));
    }
}
