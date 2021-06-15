package Memento;

public class Cliente {
    public static void main(String[] args) {

        Versionamiento versionamiento=new Versionamiento();
        Version version=new Version();

        Archivo archivo = new Archivo("Este documento es una prueba");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

        Archivo archivo = new Archivo("El exito solo depende de tu esfuerxo");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

        Archivo archivo = new Archivo("Prologo");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

        Archivo archivo = new Archivo("Este documneot fue actualizado");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

    }
}
