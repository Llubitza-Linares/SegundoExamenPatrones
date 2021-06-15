package Memento;

public class Cliente {
    public static void main(String[] args) {

        Versionamiento versionamiento=new Versionamiento();
        Version version=new Version();

        Archivo archivo = new Archivo("Este documento es una prueba");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

        Archivo archivo2 = new Archivo("El exito solo depende de tu esfuerxo");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

        Archivo archivo3 = new Archivo("Prologo");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

        Archivo archivo4 = new Archivo("Este documneot fue actualizado");
        versionamiento.setState(archivo);
        version.addArchivo(versionamiento.createVersion());

    }
}
