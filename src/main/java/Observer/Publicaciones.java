package Observer;

import java.util.ArrayList;
import java.util.List;

public class Publicaciones implements INotificaciones {

    private List<IUsuario> observerList= new ArrayList<>();
    private List<Notificaciones> notificacionList = new ArrayList<>();

    public void uploadNewNotificacion(Notificaciones notificaciones){
        notificacionList.add(notificaciones);
        this.notifyObserver(notificaciones);
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Notificaciones notificaciones) {
        for (IUsuario usuario:observerList) {
            if (usuario.getCategoria().equals(notificaciones.getCategoria())){
                usuario.update("Notificacion: " + notificaciones.getContenido(),notificaciones);
            }

        }
    }
}