package ChainResponsability;

public abstract class ChatEducativo {
    protected IChat iChat;

    public ChatEducativo(IChat iChat){
        this.iChat =iChat;
    }

    protected abstract void enviar(Mensaje mensaje);
    protected abstract void recibir(String message);
}
