package Memento;

public class Versionamiento {
    private Archivo state;
    private int version = 0;

    public void setState(Archivo state) {

        System.out.println("*******************************Establecer Estado");
        if (state.getContenido().split("").length >= 5) {
            version++;
            state.setAlias("version" + version);
        }
        state.showInfo();
        this.state = state;
    }

    public Estado createVersion() {
        System.out.println("*****************************Crear Version");
        state.showInfo();
        return new Estado(this.state);
    }

}
