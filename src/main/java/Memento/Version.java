package Memento;

import java.util.ArrayList;
import java.util.List;

public class Version {

    private List<Estado> version = new ArrayList<>();
    public void addArchivo(Estado estadoArchivo){
        if(estadoArchivo.getArchivo().getContenido().split("").length>=5){
            version.add(estadoArchivo);
        }else{
            System.out.println("No hay las palabras necesarias para crear la nueva version");
        }
    }

    public Estado getArchivo(int statePosition){
        return version.get(statePosition);
    }
}
