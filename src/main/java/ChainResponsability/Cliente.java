package ChainResponsability;

public class Cliente {
    public static void main(String[] args) {
        ChatDeComunicacion chatDeComunicacion = new ChatDeComunicacion();

        Estudiante estudiante1 = new Estudiante("Maria", 65464, chatDeComunicacion);
        Estudiante estudiante2 = new Estudiante("Andres", 84654, chatDeComunicacion);

        Docente docente1 = new Docente(564987532, "Fernanda", chatDeComunicacion);
        Docente docente2 = new Docente(546465415, "Daniel", chatDeComunicacion);

        Administrativo administrativo1 =  new Administrativo("Director", "Alvaro", chatDeComunicacion);
        Administrativo administrativo2 =  new Administrativo("Jefe de carrera", "Michelle", chatDeComunicacion);

        chatDeComunicacion.addPersonasAlChat(estudiante1);
        chatDeComunicacion.addPersonasAlChat(estudiante2);
        chatDeComunicacion.addPersonasAlChat(docente1);
        chatDeComunicacion.addPersonasAlChat(docente2);
        chatDeComunicacion.addPersonasAlChat(administrativo1);
        chatDeComunicacion.addPersonasAlChat(administrativo2);

        estudiante1.mensajeATodos("Este mensaje es para todos");
        estudiante2.mensajeADocentes("Este mensaje es solo para los docentes");
        estudiante1.mensajeAAdministrativos("Este mensaje es solo para los administrativos");

        docente1.mensajeAEstudiantes("Les comparto esto a mis alumnos");
        docente1.mensajeADocentes("Les comparto esto a los demas docentes");

        administrativo1.mensajeATodos("El mendaje va dirigido a todos");

    }
}