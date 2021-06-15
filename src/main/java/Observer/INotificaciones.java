package Observer;

public interface INotificaciones {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Notificaciones notificaciones);
}
