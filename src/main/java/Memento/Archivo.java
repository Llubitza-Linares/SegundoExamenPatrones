package Memento;

public class Archivo {
    private String alias="No Version";
    private String contenido;

    public Archivo(String contenido){
        this.contenido=contenido;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void showInfo(){
        System.out.println("Alias:");
        System.out.println(alias);
        System.out.println("Contenido:");
        System.out.println(contenido);
    }
}
