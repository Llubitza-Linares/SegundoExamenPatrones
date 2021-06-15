package ChainResponsability;

import java.util.ArrayList;
import java.util.List;

public class ChatDeComunicacion implements IChat {

    private List<ChatEducativo> personasChat= new ArrayList<>();

    public void addPersonasAlChat(ChatEducativo chatEducativo){
        personasChat.add(chatEducativo);
    }
    @Override
    public void send(Mensaje mensaje, ChatEducativo chatEducativo) {
        for (ChatEducativo persona1 : personasChat) {
            if(persona1!= chatEducativo) {
                if(persona1 instanceof Estudiante && mensaje.isEstudiantes()) {
                    persona1.recibir(mensaje.getContenido());
                }
                if(persona1 instanceof Docente && mensaje.isDocentes()) {
                    persona1.recibir(mensaje.getContenido());
                }
                if(persona1 instanceof Administrativo && mensaje.isAdministrativos()) {
                    persona1.recibir(mensaje.getContenido());
                }
            }
        }

    }
}