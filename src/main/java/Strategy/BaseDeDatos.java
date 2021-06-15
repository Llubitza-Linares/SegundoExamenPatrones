package Strategy;

import java.util.LinkedList;
import java.util.List;

public class BaseDeDatos {
    private IOrdenamiento ordenamiento;
    private List<Usuarios> usuarios = new LinkedList<Usuarios>();

    public IOrdenamiento getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(IOrdenamiento ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public void ordenar() {
        ordenamiento.ordenar(usuarios);
    }
}