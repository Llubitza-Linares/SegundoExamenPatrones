package Memento;

public class Estado {
    private Archivo archivo;
    public Estado(Archivo archivo){
        this.archivo=archivo;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }
}
