package State;

public class Cliente {
    public static void main(String[] args) {
        IEstado estado=new Apagado();
        Computadora computadora=new Computadora();
        computadora.setEstado(estado);
        computadora.request();

        estado=new Prendido();
        computadora.setEstado(estado);
        computadora.request();

        estado=new Reiniciar();
        computadora.setEstado(estado);
        computadora.request();
    }
}
